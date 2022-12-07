package org.animal.controller;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import org.animal.model.free_uploadVO;
import org.animal.model.info_uploadVO;
import org.animal.model.photoVO;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class uploadControoler {
	// 년,월,일 폴더를 생성하는 메서드 선언
	private String getFolder() {
		// 현재날짜 추출(Thu Aug 24 09:23:12 KST 2022)
		Date date = new Date();
		// Thu Aug 24 09:23:12 KST 2022 > 2022-08-24 (mm=분, MM=월)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		// 현재날짜와 날짜형식 을 연결.
		String str = sdf.format(date); // 2022-08-24
		System.out.println("Format 적용 현재날짜 : " + str);
		// 2022-08-24 > 2022\08\24로 변경

		return str.replace("-", "\\");
	}

	// 내가 올리고자 하는 파일이 이미지 파일인지 아닌지 구분하는 메서드 선언
	// 반환타입 메소드명 타입변수명
	private boolean checkImageType(File file) {
		// probeContentType(경로) : 파일경로에 있는 파일타입을 알아내는 메서드
		try {
			String contentType = Files.probeContentType(file.toPath());
			System.out.println("contentType=" + contentType);
			// 파일타입이 image이면 true, 그 이외에는 false
			return contentType.startsWith("image");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	/* 동물 소개 이미지 메인 업로드 */
	@RequestMapping(value = "/information_main", method = RequestMethod.POST)
	public ResponseEntity<info_uploadVO> info_img_mainPost(MultipartFile main) {
		// SAttachFileVO클래스 포함
		info_uploadVO infovo = new info_uploadVO();
		// 폴더 경로
		String uploadFolder = "D:\\upload\\information\\main";
		// 서버 업로드 경로와 getFolder메서드의 날짜문자열을 이어서 하나의 폴더 생성
		File uploadPath = new File(uploadFolder, getFolder());

		// 폴더 생성
		if (uploadPath.exists() == false) {// uploadPath가 존재하지 않으면,
			uploadPath.mkdirs(); // 만들어라
		}

		System.out.println("getOriginalFilename=" + main.getOriginalFilename());
		System.out.println("getSize=" + main.getSize());

		// 파일저장
		// 실제 파일명(multiparFile.getOriginalFilename())
		// UUID 적용(UUID_multiparFile.getOriginalFilename())
		UUID uuid = UUID.randomUUID();
		System.out.println("info_main.UUID= " + uuid.toString());

		// SAttachFileVO의 uploadPath 변수에 저장()
		infovo.setInfo_upload(getFolder());
		// SAttachFileVO의 fileName 변수에 저장()
		infovo.setInfo_name(main.getOriginalFilename());
		// SAttachFileVO의 uuid 변수에 저장()
		infovo.setInfo_uid(uuid.toString());	
		// SAttachFileVO의 vision 변수에 저장()
		infovo.setVision("m");

		// 어느폴더에(D:\\upload\\현재날짜), 어떤파일이름으로(mainlogo_new.png)
		File saveFile = new File(uploadPath + "\\" + uuid.toString() + "_" + main.getOriginalFilename());
		// D:\\upload\\mainlogo_new.png에 파일을 전송(transferTo)
		try {// transferTo() 메소드에 예외가 있으면
			main.transferTo(saveFile); // 서버 원본파일 전송
			// 내가 서버에 올리고자 하는 파일이 이미지 이면,
			if (checkImageType(saveFile)) {
				// AttachFileVO의 image 변수에 저장()
				infovo.setInfo_image(true);
			} // checkImageType 메서드 끝
		} catch (Exception e) {// 예외를 처리하라.
			System.out.println(e.getMessage());
		}
		return new ResponseEntity<>(infovo, HttpStatus.OK);// new ResponseEntity<>(list, HttpStatus.OK);
	}

	/* 동물 소개 이미지 서브 업로드 */
	@RequestMapping(value = "/information_sub", method = RequestMethod.POST)
	public ResponseEntity<ArrayList<info_uploadVO>> info_img_post(MultipartFile[] sub) {
		// SAttachFileVO
		ArrayList<info_uploadVO> list = new ArrayList<>();
		// 폴더 경로
		String uploadFolder = "D:\\upload\\information\\sub";
		// 서버 업로드 경로와 getFolder메서드의 날짜문자열을 이어서 하나의 폴더 생성
		File uploadPath = new File(uploadFolder, getFolder());
		// 폴더 생성
		if (uploadPath.exists() == false) {// uploadPath가 존재하지 않으면,
			uploadPath.mkdirs(); // 만들어라
		}
		// for(변수명:배열명)
		for (MultipartFile multipartFile : sub) {
			// SAttachFileVO클래스으의 새로운 주소를 반복적으로 생성하여
			// ArrayList에 저장
			info_uploadVO infovo = new info_uploadVO();

			System.out.println("getOriginalFilename=" + multipartFile.getOriginalFilename());
			System.out.println("getSize=" + multipartFile.getSize());
			// 파일저장
			// 실제 파일명(multiparFile.getOriginalFilename())
			// UUID 적용(UUID_multiparFile.getOriginalFilename())
			UUID uuid = UUID.randomUUID();
			System.out.println("info_sub.UUID= " + uuid.toString());

			// SAttachFileVO의 uploadPath 변수에 저장()
			infovo.setInfo_upload(getFolder());
			// SAttachFileVO의 fileName 변수에 저장()
			infovo.setInfo_name(multipartFile.getOriginalFilename());
			// SAttachFileVO의 uuid 변수에 저장()
			infovo.setInfo_uid(uuid.toString());	
			// SAttachFileVO의 vision 변수에 저장()
			infovo.setVision("s");

			// 어느폴더에(D:\\upload\\현재날짜), 어떤파일이름으로(mainlogo_new.png)
			File saveFile = new File(uploadPath+"\\"+uuid.toString() + "_" + multipartFile.getOriginalFilename());
			// D:\\upload\\mainlogo_new.png에 파일을 전송(transferTo)
			try {// transferTo() 메소드에 예외가 있으면
				multipartFile.transferTo(saveFile); // 서버 원본파일 전송
				// 내가 서버에 올리고자 하는 파일이 이미지 이면,
				if (checkImageType(saveFile)) {
					// AttachFileVO의 image 변수에 저장()
					infovo.setInfo_image(true);
				} // checkImageType 메서드 끝

				// SAttachFileVO에 저장된 데이터를 배열에 추가
				list.add(infovo);
			} catch (Exception e) {// 예외를 처리하라.
				System.out.println(e.getMessage());
			}
		}
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
	
	/* 사진첩 이미지 업로드 */
	@RequestMapping(value = "/photo_img", method = RequestMethod.POST)
	public ResponseEntity<photoVO> photo_img_Post(MultipartFile photo) {
		// SAttachFileVO클래스 포함
		photoVO photovo = new photoVO();
		// 폴더 경로
		String uploadFolder = "D:\\upload\\photo";
		// 서버 업로드 경로와 getFolder메서드의 날짜문자열을 이어서 하나의 폴더 생성
		File uploadPath = new File(uploadFolder, getFolder());

		// 폴더 생성
		if (uploadPath.exists() == false) {// uploadPath가 존재하지 않으면,
			uploadPath.mkdirs(); // 만들어라
		}

		System.out.println("getOriginalFilename=" + photo.getOriginalFilename());
		System.out.println("getSize=" + photo.getSize());

		// 파일저장
		// 실제 파일명(multiparFile.getOriginalFilename())
		// UUID 적용(UUID_multiparFile.getOriginalFilename())
		UUID uuid = UUID.randomUUID();
		System.out.println("info_UUID= " + uuid.toString());

		// SAttachFileVO의 uploadPath 변수에 저장()
		photovo.setPhoto_upload(getFolder());
		// SAttachFileVO의 fileName 변수에 저장()
		photovo.setPhoto_name(photo.getOriginalFilename());
		// SAttachFileVO의 uuid 변수에 저장()
		photovo.setPhoto_uid(uuid.toString());		

		// 어느폴더에(D:\\upload\\현재날짜), 어떤파일이름으로(mainlogo_new.png)
		File saveFile = new File(uploadPath + "\\" + uuid.toString() + "_" + photo.getOriginalFilename());
		// D:\\upload\\mainlogo_new.png에 파일을 전송(transferTo)
		try {// transferTo() 메소드에 예외가 있으면
			photo.transferTo(saveFile); // 서버 원본파일 전송
			// 내가 서버에 올리고자 하는 파일이 이미지 이면,
			if (checkImageType(saveFile)) {
				// AttachFileVO의 image 변수에 저장()
				photovo.setPhoto_image(true);
			} // checkImageType 메서드 끝
		} catch (Exception e) {// 예외를 처리하라.
			System.out.println(e.getMessage());
		}
		return new ResponseEntity<>(photovo, HttpStatus.OK);// new ResponseEntity<>(list, HttpStatus.OK);
	}
	
	/* 자유게시판 이미지  업로드 */
	@RequestMapping(value = "/free_img", method = RequestMethod.POST)
	public ResponseEntity<ArrayList<free_uploadVO>> free_img_post(MultipartFile[] free_board_img) {
		ArrayList<free_uploadVO> list = new ArrayList<>();
		// 폴더 경로
		String uploadFolder = "D:\\upload\\free_board";
		// 서버 업로드 경로와 getFolder메서드의 날짜문자열을 이어서 하나의 폴더 생성
		File uploadPath = new File(uploadFolder, getFolder());
		// 폴더 생성
		if (uploadPath.exists() == false) {// uploadPath가 존재하지 않으면,
			uploadPath.mkdirs(); // 만들어라
		}
		// for(변수명:배열명)
		for (MultipartFile multipartFile : free_board_img) {
			// SAttachFileVO클래스으의 새로운 주소를 반복적으로 생성하여
			// ArrayList에 저장
			free_uploadVO freevo = new free_uploadVO();

			System.out.println("getOriginalFilename=" + multipartFile.getOriginalFilename());
			System.out.println("getSize=" + multipartFile.getSize());
			// 파일저장
			// 실제 파일명(multiparFile.getOriginalFilename())
			// UUID 적용(UUID_multiparFile.getOriginalFilename())
			UUID uuid = UUID.randomUUID();
			System.out.println("UUID= " + uuid.toString());

			// SAttachFileVO의 uploadPath 변수에 저장()
			freevo.setFree_upload(getFolder());
			// SAttachFileVO의 fileName 변수에 저장()
			freevo.setFree_name(multipartFile.getOriginalFilename());
			// SAttachFileVO의 uuid 변수에 저장()
			freevo.setFree_uid(uuid.toString());			

			// 어느폴더에(D:\\upload\\현재날짜), 어떤파일이름으로(mainlogo_new.png)
			File saveFile = new File(uploadPath+"\\"+uuid.toString() + "_" + multipartFile.getOriginalFilename());
			// D:\\upload\\mainlogo_new.png에 파일을 전송(transferTo)
			try {// transferTo() 메소드에 예외가 있으면
				multipartFile.transferTo(saveFile); // 서버 원본파일 전송
				// 내가 서버에 올리고자 하는 파일이 이미지 이면,
				if (checkImageType(saveFile)) {
					// AttachFileVO의 image 변수에 저장()
					freevo.setFree_image(true);
				} // checkImageType 메서드 끝

				// SAttachFileVO에 저장된 데이터를 배열에 추가
				list.add(freevo);
			} catch (Exception e) {// 예외를 처리하라.
				System.out.println(e.getMessage());
			}
		}
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
	/*이미지 삭제*/
	@RequestMapping(value = "/deleteFile", method = RequestMethod.POST)
	public ResponseEntity<String> deleteFile(String filename, String type) {
		File file;
		try {
			file = new File("D:\\upload\\" + URLDecoder.decode(filename, "UTF-8"));
			file.delete();
			if(type.equals("image")) {
				String largeFileName = file.getAbsolutePath().replace("s_", "");
				file = new File(largeFileName);
				file.delete();
			}
		}catch(UnsupportedEncodingException e){
			e.printStackTrace();
			return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<String>("deleted", HttpStatus.OK);
	}
	
	/*화면 이미지 불러오기*/
	@RequestMapping(value = "/display", method = RequestMethod.GET)
	public ResponseEntity<byte[]> getFile(String filename) {
		File file = new File("D:\\upload\\" + filename); // 경로 숨기는 작업

		ResponseEntity<byte[]> result = null;

		HttpHeaders headers = new HttpHeaders();
		try {
			headers.add("Content-Type", Files.probeContentType(file.toPath()));
			result = new ResponseEntity<>(FileCopyUtils.copyToByteArray(file), headers, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}
	
	
	@RequestMapping(value = "/download", method = RequestMethod.GET)
	public ResponseEntity<Resource> downloadFile(String filename) {
		Resource resource = new FileSystemResource("D:\\upload\\" + filename);
		// 다운로드 시 파일의 이름을 처리
		String resourceName = resource.getFilename();
		HttpHeaders headers = new HttpHeaders();
		try {
			// 다운로드 파일이름이 한글일 때, 깨지지 않게 하기 위한 설정
			headers.add("Content-Disposition",
					"attachment;filename=" + new String(resourceName.getBytes("utf-8"), "ISO-8859-1"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>(resource, headers, HttpStatus.OK);
	}
}

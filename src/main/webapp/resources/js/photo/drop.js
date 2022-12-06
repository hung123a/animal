/**
 * 이미지 드래고 앤 드롭 이벤트
 */
$(document).ready(function() {
	var sec9 = document.querySelector('#photo_border'); 
    var btnUpload = sec9.querySelector('.btn-upload');
    var inputFile = sec9.querySelector('input[type="file"]');
    var uploadBox = sec9.querySelector('.photo_all');
    /* 박스 안에 Drag 들어왔을 때 */
    uploadBox.addEventListener('dragenter', function(e) {
        console.log('dragenter');
    });
    
    /* 박스 안에 Drag를 하고 있을 때 */
    uploadBox.addEventListener('dragover', function(e) {
        e.preventDefault();
        
        var vaild = e.dataTransfer.types.indexOf('Files') >= 0;

        if(!vaild){
            this.style.backgroundColor = 'red';
        }
        else{
            this.style.backgroundColor = '#ddd';
        }        
    });
   
    /* 박스 밖으로 Drag가 나갈 때 */
    uploadBox.addEventListener('dragleave', function(e) {
        console.log('dragleave');

        this.style.backgroundColor = 'white';
    });
    
    /* 박스 안에서 Drag를 Drop했을 때 */
    uploadBox.addEventListener('drop', function(e) {
        e.preventDefault();

        console.log('drop');
        this.style.backgroundColor = 'white';
        
        console.dir(e.dataTransfer);

        var data = e.dataTransfer.files[0];
        console.dir(data);   
    });
})
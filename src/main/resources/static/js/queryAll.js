
function(){
	function queryAll(){
		$.ajax({
	        type : "post", 
	        url : "/queryAll", 
	        data : "user:${list}", 
	        dataType : map,
	        success : function(result) {
	        	   var result = eval('(' + result + ')');
                   $('#id').text(result.id);
                   $('#username').text(result.username);
                   $('#pwd').text(result.password);

	        }
		
	}

               
		
}
	
}

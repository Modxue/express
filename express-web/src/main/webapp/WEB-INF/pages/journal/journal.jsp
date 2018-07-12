<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>journal</title>
<script src="https://cdn.bootcss.com/jquery/1.10.2/jquery.min.js">
  </script>
</head>
<body>

        <input type="button" id="button" value="确定" />
        <div id="result"></div>

<script type="text/javascript">
    $(document).ready(function(){
        $('#button').click(function(){
        	
			
    	$.ajax({
				url: "http://localhost:8088/express-web/manager/journal/1.json",
				type:'GET',
		        dataType:'json',
				success:function(result){
					
					addBox(result);
				}
			})
			function addBox(result){
            //result是一个集合,所以需要先遍历
            $.each(result,function(index,obj){
                $("#result").append(
                   
                    obj['logId']
                    //获得邮箱地址
                  +obj['userId']
                    );
            });
        }
        });
    });
</script>
</body>
</html>
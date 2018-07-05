<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String extjsPath = "http://202.196.37.91:8080/ext-4.2.1.883/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Express</title>
<script src="https://cdn.bootcss.com/jquery/1.10.2/jquery.min.js">
  </script>
</head>
<body>

        <input type="button" id="button" value="确定" />
        <div id="result"></div>

<script type="text/javascript">
    $(document).ready(function(){
        $('#button').click(function(){
        	var requestUrl = '';
            $.ajax({
            	url:'./.json',
                type:"GET",
                data:{},
                success:function (response) {
                    /*  处理表头 */
                    initTableHead(response.table_config);
                    initTableBody(response.data_list,response.table_config);
                    $('#result').addClass('hide');
                },
                error:function () {
                    $('.loading').addClass('hide');
                }
            })
        });
    });
</script>
</body>
</html>
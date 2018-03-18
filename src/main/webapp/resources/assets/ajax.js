$(document).ready(function(){
	 		$("#appointmentDto").hide();
			$("#dateTimePicker").change(function(e){
				var date = document.getElementById("dateTimePicker").value;
				var varDate = new Date(date); //dd-mm-YYYY
				var today = new Date();
				if(varDate < today) {
					document.getElementById("dateTimePicker").value = "";
					document.getElementById("errorDate").innerHTML  = "Date must be in the future!!!";
					document.getElementById("errorDate").style.color="red";
				} else {
					document.getElementById("errorDate").innerHTML ="";
				}
			});
			$("#newBtn").click(function(e) {
				$("#appointmentDto").show();
				$("#newBtn").hide();
			});
			$("#cancelBtn").click(function(e) {
				$("#appointmentDto").hide();
				$("#newBtn").show();
			});
			
			$("#searchBtn").click(function(e) {
				var contextRoot = "/"+ window.location.pathname.split('/')[1];
				var searchVal = " ";
				if($("#searchText").val()){
					searchVal = $("#searchText").val();
				}
				$.ajax({	
					url : contextRoot + '/ajaxSearchAppointement',
					type : 'POST',
					dataType : 'json',
					data : searchVal,
					contentType : 'application/json',
					success : function(responseObj) {
						console.log(responseObj);
						var tmphtml='<table class="table">';
						$.each(responseObj,  function(i,obj) {	
		 	 	        	tmphtml += '<tr><td>'+obj.appointmentDate+'</td><td>'+obj.appointmentTime+'</td><td>'+obj.description+'</td></tr>';
		 	 	        });
						tmphtml+="</table>";
						$("#results").html(tmphtml);
					},
					progress : function() {
						console.log('progress');
					},
					error : function(jqXHR,exception) {
						var msg = '';
						if (jqXHR.status === 0) {
							msg = 'Not connect.\n Verify Network.';
						} else if (jqXHR.status == 404) {
							msg = 'Requested page not found. [404]';
						} else if (jqXHR.status == 500) {
							msg = 'Internal Server Error [500].';
						} else if (exception === 'parsererror') {
							msg = 'Requested JSON parse failed.';
						} else if (exception === 'timeout') {
							msg = 'Time out error.';
						} else if (exception === 'abort') {
							msg = 'Ajax request aborted.';
						} else {
							msg = 'Uncaught Error.\n' + jqXHR.responseText;
						}
						
					}
				})
			.done(function(jdata) {})
			.fail(function(jdata) {console.log(jdata);})			
			});
			});
 function serializeObject (form)
{
    var jsonObject = {};
    var array = form.serializeArray();
    $.each(array, function() {
         	jsonObject[this.name] = this.value;
    });
    return jsonObject;

};

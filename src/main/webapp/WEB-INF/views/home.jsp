<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="true"%>

<link rel="stylesheet"
	href="http://code.jquery.com/ui/1.10.2/themes/smoothness/jquery-ui.css" />
<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
<script src="http://code.jquery.com/ui/1.10.2/jquery-ui.js"></script>
<script src="<c:url value="/resources/assets/ajax.js"/>"></script>

<html>
<tiles:insertDefinition name="baseLayout">
	<tiles:putAttribute name="body">

		<div class="">
			<div class="container">
				<!-- 				<div class="spacer"> -->
				<div class="row">
					<div class="col-lg-6 col-lg-offset-3 col-sm-6 col-sm-offset-3 col-xs-12 ">
						<div class="col-lg-12 row">
							<input type="button" class="btn btn-success" id="newBtn" value="New"/>
							<label id="errorDate">
						</div>
						<div class="col-lg-12 row">
							<form:form modelAttribute="appointmentDto" action="addAppointment" method="POST">
								<div class="form-group row">
									<div class="col-lg-6">
										<button type="submit" class="btn btn-success" name="Submit">
											<spring:message code="form.movie.add" text="Add" />
										</button>
									</div>
									<div class="col-lg-6">
										<input type="button" class="btn btn-success" id="cancelBtn" value="Cancel"/>
									</div>
									<div class="col-lg-12">
										<spring:message code="form.add.date" text="Date :" />
										<form:errors path="appointmentDate" />
										<form:input type="datetime-local" class="datetime form-control"
													placeholder="MM/dd/yyyy HH:mm" path="appointmentDate"
													required="required" pattern="yyyy-MM-dd'T'HH:mm:ss.SSS" id="dateTimePicker"/>
<%-- 										<form:input type="date" class="datetime form-control" --%>
<%-- 												 path="appointmentDate" pattern="MM-dd-yyyy" --%>
<%-- 													required="required"  /> --%>
									</div>
<!-- 									<div class="col-lg-12"> -->
<%-- 										<spring:message code="form.add.time" text="Time :" /> --%>
<%-- 										<form:input type="time" class="datetime form-control" --%>
<%-- 													placeholder="MM/dd/yyyy" path="appointmentTime" --%>
<%-- 													required="required" pattern="yyyy-MM-dd" /> --%>
<%-- 										<form:errors path="appointmentTime" /> --%>
<!-- 									</div> -->
									<div class="col-lg-12">
										<spring:message code="form.add.description"
											text="Descirption:" />
										<form:input class="form-control" path="description" required="required"  />
<%-- 										<form:errors path="description" /> --%>
									</div>
							</form:form>
					</div>
						</div>
					
					<div class="col-lg-12 row">
						<div class="col-lg-6">
							<input class="form-control" type="text" name="searchText" id="searchText" />
						</div>
						<div class="col-lg-6">
							<input type="button" class="btn btn-success" id="searchBtn" value="Search"/>
						</div>
						</div>
					<div class="col-lg-12 row">
					<div id="results"></div>
						</div>
						
				</div>
			</div>
	</tiles:putAttribute>
</tiles:insertDefinition>
</html>
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%><!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fess | <la:message key="labels.key_match_configuration" /></title>
<jsp:include page="/WEB-INF/view/common/admin/head.jsp"></jsp:include>
</head>
<body class="skin-blue sidebar-mini">
	<div class="wrapper">
		<jsp:include page="/WEB-INF/view/common/admin/header.jsp"></jsp:include>
		<jsp:include page="/WEB-INF/view/common/admin/sidebar.jsp">
			<jsp:param name="menuCategoryType" value="crawl" />
			<jsp:param name="menuType" value="keyMatch" />
		</jsp:include>

		<div class="content-wrapper">

			<%-- Content Header --%>
			<section class="content-header">
				<h1>
					<la:message key="labels.key_match_title_details" />
				</h1>
				<ol class="breadcrumb">
					<li><la:link href="index">
							<la:message key="labels.key_match_link_list" />
						</la:link></li>
					<c:if test="${crudMode == 1}">
						<li class="active"><a href="#"><la:message key="labels.key_match_link_create" /></a></li>
					</c:if>
					<c:if test="${crudMode == 2}">
						<li class="active"><a href="#"><la:message key="labels.key_match_link_update" /></a></li>
					</c:if>
					<c:if test="${crudMode == 3}">
						<li class="active"><a href="#"><la:message key="labels.key_match_link_delete" /></a></li>
					</c:if>
					<c:if test="${crudMode == 4}">
						<li class="active"><a href="#"><la:message key="labels.key_match_link_confirm" /></a></li>
					</c:if>
				</ol>
			</section>

			<section class="content">

				<%-- Form --%>
				<la:form>
					<la:hidden property="crudMode" />
					<c:if test="${crudMode==2 || crudMode==3 || crudMode==4}">
						<la:hidden property="id" />
						<la:hidden property="versionNo" />
					</c:if>
					<la:hidden property="createdBy" />
					<la:hidden property="createdTime" />
					<div class="row">
						<div class="col-md-12">
							<div class="box">
								<%-- Box Header --%>
								<div class="box-header with-border">
									<h3 class="box-title">
										<c:if test="${crudMode == 1}">
											<la:message key="labels.key_match_link_create" />
										</c:if>
										<c:if test="${crudMode == 2}">
											<la:message key="labels.key_match_link_update" />
										</c:if>
										<c:if test="${crudMode == 3}">
											<la:message key="labels.key_match_link_delete" />
										</c:if>
										<c:if test="${crudMode == 4}">
											<la:message key="labels.key_match_link_confirm" />
										</c:if>
									</h3>
									<div class="box-tools pull-right">
										<span class="label label-default"><la:link href="index">
												<la:message key="labels.key_match_link_list" />
											</la:link></span>
									</div>
								</div>
								<%-- Box Body --%>
								<div class="box-body">
									<%-- Message --%>
									<div>
										<la:info id="msg" message="true">
											<div class="alert-message info">
												${msg}
											</div>
										</la:info>
										<la:errors />
									</div>

									<%-- Form Fields --%>
									<table class="table table-bordered">
										<tbody>
											<tr>
												<th class="col-xs-2"><la:message key="labels.key_match_term" /></th>
												<td>${f:h(term)}<la:hidden property="term" /></td>
											</tr>
											<tr>
												<th><la:message key="labels.key_match_query" /></th>
												<td>${f:h(query)}<la:hidden property="query" /></td>
											</tr>
											<tr>
												<th><la:message key="labels.key_match_size" /></th>
												<td>${f:h(maxSize)}<la:hidden property="maxSize" /></td>
											</tr>
											<tr>
												<th><la:message key="labels.key_match_boost" /></th>
												<td>${f:h(boost)}<la:hidden property="boost" /></td>
											</tr>
										</tbody>
									</table>

								</div>
								<%-- Box Footer --%>
								<div class="box-footer">
									<c:if test="${crudMode == 1}">
										<input type="submit" class="btn" name="createagain" value="<la:message key="labels.key_match_button_back"/>" />
										<input type="submit" class="btn btn-primary" name="create"
											value="<la:message key="labels.key_match_button_create"/>"
										/>
									</c:if>
									<c:if test="${crudMode == 2}">
										<input type="submit" class="btn" name="editagain" value="<la:message key="labels.key_match_button_back"/>" />
										<input type="submit" class="btn btn-primary" name="update"
											value="<la:message key="labels.key_match_button_update"/>"
										/>
									</c:if>
									<c:if test="${crudMode == 3}">
										<input type="submit" class="btn" name="back" value="<la:message key="labels.key_match_button_back"/>" />
										<input type="submit" class="btn btn-primary" name="delete"
											value="<la:message key="labels.key_match_button_delete"/>"
										/>
									</c:if>
									<c:if test="${crudMode == 4}">
										<input type="submit" class="btn" name="back" value="<la:message key="labels.key_match_button_back"/>" />
										<input type="submit" class="btn" name="editfromconfirm"
											value="<la:message key="labels.key_match_button_edit"/>"
										/>
										<input type="submit" class="btn" name="deletefromconfirm"
											value="<la:message key="labels.key_match_button_delete"/>"
										/>
									</c:if>
								</div>
							</div>
						</div>
					</div>
				</la:form>

			</section>
		</div>

		<jsp:include page="/WEB-INF/view/common/admin/footer.jsp"></jsp:include>
	</div>
	<jsp:include page="/WEB-INF/view/common/admin/foot.jsp"></jsp:include>
</body>
</html>


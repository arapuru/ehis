<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<jsp:include page="/common/cssinclude.jsp"></jsp:include>



<s:div id="login-page">

	<s:div cssClass="container">

		<s:form cssClass="form-login" theme="simple" action="loginvalidate.action">
		
		

			<h2 class="form-login-heading">sign in now</h2>

			<s:div cssClass="login-wrap">
				<s:actionerror/>
				<s:textfield name="username" cssClass="form-control"
					 size="20" />
				<br>
				<s:password name="password" key="password"  cssClass="form-control"
					 size="20" />
				<br>
				<s:submit method="execute" cssClass="btn btn-theme btn-block"
					align="center">
				</s:submit>

			</s:div>

		</s:form>



	</s:div>

</s:div>










<jsp:include page="/common/jssinclude.jsp"></jsp:include>
  <script>
        $.backstretch("assets/img/login-bg.jpg", {speed: 500});
    </script>
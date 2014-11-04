<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<jsp:include page="/common/cssinclude.jsp"></jsp:include>



<section id="container" >
  <jsp:include page="/common/header.jsp"></jsp:include>
      
     <jsp:include page="/common/receptionmenu.jsp"></jsp:include>
      <!-- **********************************************************************************************************************************************************
      MAIN CONTENT
      *********************************************************************************************************************************************************** -->
      <!--main content start-->
      <section id="main-content">
      
          <section class="wrapper site-min-height">
          	<div class="row mt">
          	<div class="col-md-12">
          	
          
           <div class="form-panel">
           
           <h3>Welcome to Patient Management</h3>
           
           <a href="addPatient.action" class="btn btn-primary btn-theme" > Add Patient </a>
           <hr>
          	         		
         <table class="table table-striped table-advance table-hover">
    <tr>
        <th>Id</th>
        <th>Firstname</th>
        <th>Lastname</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>
    <s:iterator value="patientList"  status="status">
        <tr class="<s:if test="#status.even">even</s:if><s:else>odd</s:else>">
            <td ><s:property value="id"/></td>
            <td ><s:property value="firstname"/></td>
            <td ><s:property value="lastname"/></td>
            <td ><s:url id="update" action="updatePatient">
		       		   <s:param name="patient.id" value="id"/>
		       		</s:url> <s:a href="%{update}" cssClass="fa fa-pencil fa-3 " ></s:a>
		       		</td>
		       		<td>
                   <s:url id="delete" action="deletepatient">
                                   <s:param name="department.id" value="id"/>
		       		</s:url> 
		       		<s:a href="%{delete}" cssClass="fa fa-trash-o fa-3 "></s:a>
		       		</td>
        </tr>  		
	 </s:iterator>
    </table>
          		
          		
          		</div>
			
				</div>
			</div>
		</section>
      </section><!-- /MAIN CONTENT -->

<jsp:include page="/common/footer.jsp"></jsp:include>
     
  </section>



<jsp:include page="/common/jssinclude.jsp"></jsp:include>
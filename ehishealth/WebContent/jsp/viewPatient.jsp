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
          	 <h3>Enter Patient Details</h3>
          	<div class="form-group">
                 <label class="col-sm-2 col-sm-2 control-label">First Name</label>
                 <div class="col-sm-10">
                 <s:property   value="firstname"  />
                 </div>
            </div>
            
            	<div class="form-group">
                 <label class="col-sm-2 col-sm-2 control-label">Last Name</label>
                 <div class="col-sm-10">
                 <s:property  value="lastname"  />
                 </div>
            </div>
            
            <div class="form-group">
                 <label class="col-sm-2 col-sm-2 control-label">Age</label>
                 <div class="col-sm-10">
                   <s:property  value="age"  />
                 </div>
            </div>
             <div class="form-group">
                 <label class="col-sm-2 col-sm-2 control-label">Sex</label>
                 <div class="col-sm-10">
                 <s:property  value="sex"  />
                 </div>
            </div>
            
            <div class="form-group">
                 <label class="col-sm-2 col-sm-2 control-label">BloodGroup</label>
                 <div class="col-sm-10">
                 <s:property   value="bloodgroup"  />
                 </div>
            </div>
            
            
             	<div class="form-group">
                 <label class="col-sm-2 col-sm-2 control-label">Address</label>
                 <div class="col-sm-10">
                 
                 <s:textarea name="address" value="" rows="5" cols="10" cssClass="form-control" ><s:property   value="address"  /></s:textarea>
                 </div>
            </div>
            
          		
          		
          		</div>
			
				</div>
			</div>
		</section>
      </section><!-- /MAIN CONTENT -->

<jsp:include page="/common/footer.jsp"></jsp:include>
     
  </section>



<jsp:include page="/common/jssinclude.jsp"></jsp:include>
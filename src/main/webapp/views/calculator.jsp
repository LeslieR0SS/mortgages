<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
 <head>
      <meta charset="utf-8">
      <title>Mortgages Calculator</title>
      <link rel="icon" type="image/x-icon" href="./assets/house-2.png">
      <link rel="stylesheet" href="./css/style.css">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
   </head>
<body>
      <div class="wrapper">
         <div class="title-text">
            <div class="title-calculator">
			Mortgage Amortization Table with Fixed Payments - French System
            </div>
         </div>
 
            <div class="form-inner">
               <form action="" method="" class="calculator" name="calculator">
                  <div class="field">
                     <input type="text" placeholder="Mortgage amount:" name="amount" id="amount" required>
                  </div>
                  <div class="field">
                     <input type="text" placeholder="Interest rate, in %:" name="interest" id="interest" required>
                  </div>
                  <div class="field">
                     <input type="text" placeholder="Amortization term, in years:" name="term" id="term" required>
                  </div>
                  <div class="dropdown">
                  	<select name="frequency" id="frequency" required>
                  		<option disabled selected hidden>Frequency of installment payments:</option>
                  		<option value="monthly">Monthly</option>
                  		<option value="quarterly">Quarterly</option>
                  		<option value="four-month">Four-Monthly</option>
                  		<option value="semi-annual">Semi-Annual</option>
                  		<option value="annual">Annual</option>
                  	</select>
                  </div>
                  
                  <div class="field btn">
                     <div class="btn-layer"></div>
                     <input type="submit" value="Calculate">
                  </div>
                   <div class="field btn">
                     <div class="btn-layer"></div>
                     <input type="reset" value="Reset">
                  </div>
                  
                  <div class="field btn">
                     <div class="btn-layer"></div>
                     <input type="button" value="Records"/>
                  </div>
                  

               </form>
            </div>
		</div>
              
</body>
</html>
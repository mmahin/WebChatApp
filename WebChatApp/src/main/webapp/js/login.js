//JQuery for html5 placeholder

     (function ($) {
         $.support.placeholder = ('placeholder' in document.createElement('input'));
     })(jQuery);


     //fix for IE7 and IE8
     $(function () {
         if (!$.support.placeholder) {
             $("[placeholder]").focus(function () {
                 if ($(this).val() == $(this).attr("placeholder")) $(this).val("");
             }).blur(function () {
                 if ($(this).val() == "") $(this).val($(this).attr("placeholder"));
             }).blur();

             $("[placeholder]").parents("form").submit(function () {
                 $(this).find('[placeholder]').each(function() {
                     if ($(this).val() == $(this).attr("placeholder")) {
                         $(this).val("");
                     }
                 });
             });
         }
     });
     
//JQuery and Ajax login check
     $(document).ready(function(){
    	 $("#loginfrm").submit(function(){
    	  
    	 //remove previous class and add new "myinfo" class
    	 $("#loginsts").removeClass().addClass('myinfo').text('Checking..... ').fadeIn(1000);
    	  
    	 this.timer = setTimeout(function () {
    	 $.ajax({
    	 url: 'login.jsp',
    	 data: 'username='+ $('#username').val() +'&passwordd=' + $('#password').val()+'keeplogin='+ $('#check').val() ,
    	 type: 'post',
    	 success: function(msg){
    	 if(msg != 'ERROR') // Message Sent, check and redirect
    	 {                // and direct to the success page
    	  
    	 $("#loginsts").html('Logging in.....').addClass('myinfo').fadeTo(900,1,
    	 function()
    	 {
    	 //redirect to secure page
    	 document.location='login.jsp?user='+msg;
    	 });
    	  
    	 }
    	 else
    	 {
    	 $("#loginsts").fadeTo(200,0.1,function() //start fading the messagebox
    	 {
    	 //add message and change the class of the box and start fading
    	 $(this).html('Sorry, Wrong Username or Password.').removeClass().addClass('myerror').fadeTo(900,1);
    	 });
    	  
    	 }
    	 }
    	  
    	 });
    	 }, 200);
    	 return false;
    	 });
    	  
    	 });
    	  

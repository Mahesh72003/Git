class Instagram
{
    public static String loging(String emailId, String password)
    {
        String message = null;
        if(emailId.equals("maheshvanjre@gmail.com") && password=="mahesh")
        {
            message = "Login is successful using email";
        }
        else
        {
            message = "Login is unsuccessful. Please check your email and password.";
        }
        return message;
    }

    public static String loging(long phoneNumber, String password)
    {
        String message = null;
        if(phoneNumber == 8904644069L && password=="mahesh")
        {
            message = "Login is successful using phone number";
        }
        else
        {
            message = "Login is unsuccessful. Please check your phone number and password.";
        }
        return message;
    }

    public static String logingusername(String password, String username)
    {
        String message = null;
        if(password=="mahesh" && username=="mahesh123")
        {
            message = "Login is successful using username";
        }
        else
        {
            message = "Login is unsuccessful. Please check your username and password.";
        }
        return message;
    }
}

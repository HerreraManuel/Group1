/***********************************************************************************************
 Programmer(s): Jenzel Arevalo

 Class Description:
 SystemIdentifier helps identify what system the program is running on. SystemIdentifier can
 currently identify if program is running on Windows, Linux, and Mac OSX.

 External Contributions:


 NOTE: Mac OSX in theory should be identified; however, due to the current systems our group
 has we CANNOT officially determine if Mac OSX can be identified.
 **********************************************************************************************/

package Helper;

public class SystemIdentifier
{
    public SystemIdentifier()
    {
    }

    public String identify()
    {
        String currentOS = System.getProperty("os.name").toLowerCase();

        if(isWindows(currentOS))
        {
            System.out.println("WINDOWS");
            return "WINDOWS";
        }

        if(isMac(currentOS))
        {
            System.out.println("MAC");
            return "MAC";

        }

        if(isLinux(currentOS))
        {
            System.out.println("LINUX/UNIX");
            return "LINUX/UNIX";
        }

        System.out.println("UNKNOWN_SYSTEM");
        return "UNKNOWN_SYSTEM";
    }

    private boolean isWindows(String currentOS)
    {
        return (currentOS.indexOf("win") >= 0);
    }

    private boolean isMac(String currentOS)
    {
        return (currentOS.indexOf("mac") >= 0);
    }

    private boolean isLinux(String currentOS)
    {
        return ((currentOS.indexOf("nix") >= 0) || (currentOS.indexOf("nux") >= 0) || (currentOS.indexOf("aix") > 0));
    }
}

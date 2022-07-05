package HomeWork.Class25;

interface RemoteDriver extends TakesScreenShot, WebDriver{
    void navigate();
}


interface TakesScreenShot {
    void getScreenshot();
}

interface WebDriver {
    void open();
    void close();
    String getTitle();
}



class ChromeDriver implements RemoteDriver  {


    @Override
    public void navigate() {
        System.out.println("Navigates around Chrome");
    }

    @Override
    public void getScreenshot() {
        System.out.println("takes screenshot of page on Chrome");
    }

    @Override
    public void open() {
        System.out.println("Opens Chrome browser");
    }

    @Override
    public void close() {
        System.out.println("Closes Chrome tab");
    }

    @Override
    public String getTitle() {
        return "Chrome Title";
    }
}

class FireFoxDriver implements RemoteDriver{


    @Override
    public void navigate() {
        System.out.println("Navigates around FireFox");
    }

    @Override
    public void getScreenshot() {
        System.out.println("takes screenshot of page on FireFox");
    }

    @Override
    public void open() {
        System.out.println("Opens FireFox browser");
    }

    @Override
    public void close() {
        System.out.println("Closes FireFox tab");
    }

    @Override
    public String getTitle() {
        return "FireFox Title";
    }
}
class SafariDriver implements RemoteDriver{


    @Override
    public void navigate() {
        System.out.println("Navigates around Safari");
    }

    @Override
    public void getScreenshot() {
        System.out.println("takes screenshot of page on Safari");
    }

    @Override
    public void open() {
        System.out.println("Opens Safari browser");
    }

    @Override
    public void close() {
        System.out.println("Closes Safari tab");
    }

    @Override
    public String getTitle() {
        return "Safari Title";
    }
}

class Main{
    public static void main(String[] args) {
        RemoteDriver [] browsers= {new ChromeDriver(), new SafariDriver(), new FireFoxDriver()};

        for (RemoteDriver br:browsers){
            br.open();
            br.navigate();
            br.getScreenshot();
            br.getTitle();
            br.close();
        }

    }
}
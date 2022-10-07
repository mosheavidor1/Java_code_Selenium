package Infra.Properties.Selenium;

public  class Selenium_FireFox_Driver extends Browsers implements Browser_Properties {



    @Override
    public void Drivers() {
        System.setProperty(FF_Pro, FF_Path);



    }

}




package constants;

public class XPath {
    public interface Common {
        String mainPageA = "//*[@id=\"nava\"]",
        homeA = "//*[@id=\"navbarExample\"]/ul/li[1]/a",
        contactA = "//*[@id=\"navbarExample\"]/ul/li[2]/a",
        aboutUsA = "//*[@id=\"navbarExample\"]/ul/li[3]/a",
        cartA ="//*[@id=\"navbarExample\"]/ul/li[4]/a",
        logInA= "//*[@id=\"navbarExample\"]/ul/li[5]/a",
        signUpA="//*[@id=\"navbarExample\"]/ul/li[6]/a",
        contactXButton="//*[@id=\"exampleModal\"]/div/div/div[1]/button/span",
        contactCloseButton="//*[@id=\"exampleModal\"]/div/div/div[3]/button[1]",
        contactEmailInput="//*[@id=\"recipient-email\"]",
        contactNameInput="//*[@id=\"recipient-name\"]",
        contactMessageTextarea="//*[@id=\"message-text\"]",
        contactSendMessageButton="//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]",
        aboutUsVideo="//*[@id=\"example-video_html5_api\"]",
        aboutUsXbutton="//*[@id=\"videoModal\"]/div/div/div[1]/button/span",
        aboutUsCloseButton="//*[@id='videoModal']/div/div/div[3]/button",
        logInXButton = "//*[@id=\"logInModal\"]/div/div/div[1]/button/span",
        logInCloseButton="//*[@id=\"logInModal\"]/div/div/div[3]/button[1]",
        logInUsernameInput="//*[@id=\"loginusername\"]",
        logInPasswordInput="//*[@id=\"loginpassword\"]",
        logInLogInButton="//*[@id=\"logInModal\"]/div/div/div[3]/button[2]",
        signUpXButton="//*[@id=\"signInModal\"]/div/div/div[1]/button/span",
        signUpCloseButton="//*[@id=\"signInModal\"]/div/div/div[3]/button[1]",
        signUpUsernameInput="//*[@id=\"sign-username\"]",
        signUpPasswordInput="//*[@id=\"sign-password\"]",
        signUpSignUpButton="//*[@id=\"signInModal\"]/div/div/div[3]/button[2]";

    }
    interface Homepage {
        String carouselRight ="//*[@id=\"carouselExampleIndicators\"]/a[2]",
        carouselLeft = "//*[@id=\"carouselExampleIndicators\"]/a[1]",
        carouselImg1="//*[@id=\"carouselExampleIndicators\"]/div/div[1]/img",
        carouselImg2="//*[@id=\"carouselExampleIndicators\"]/div/div[2]/img",
        carouselImg3="//*[@id=\"carouselExampleIndicators\"]/div/div[3]/img",
        categoriesA="//*[@id=\"cat\"]",
        categoriesPhonesA= "/html/body/div[5]/div/div[1]/div/a[2]",
        categoriesLaptopsA= "/html/body/div[5]/div/div[1]/div/a[3]",
        categoriesMonitorsA="/html/body/div[5]/div/div[1]/div/a[4]",
        previousButton = "//*[@id=\"prev2\"]",
        nextButton = "//*[@id=\"next2\"]";
    }
    interface ProductPage {
        String img="//*[@id=\"imgp\"]/div/img",
        carouselIndicator1="//*[@id=\"myCarousel-2\"]/ol/li[1]",
        carouselIndicator2="//*[@id=\"myCarousel-2\"]/ol/li[2]",
        carouselIndicator3="//*[@id=\"myCarousel-2\"]/ol/li[3]",
        addToCartButton="//*[@id=\"tbodyid\"]/div[2]/div/a";
    }
    interface CartPage {
        String placeOrderButton="//*[@id=\"page-wrapper\"]/div/div[2]/button",
        orderNameInput ="//*[@id=\"name\"]",
        orderCountryInput="//*[@id=\"country\"]",
        orderCityInput="//*[@id=\"city\"]",
        orderCreditCardInput="//*[@id=\"card\"]",
        orderCardMonthInput="//*[@id=\"month\"]",
        orderCardYearInput="//*[@id=\"year\"]",
        orderXButton="//*[@id=\"orderModal\"]/div/div/div[1]/button/span",
        orderCloseButton="//*[@id=\"orderModal\"]/div/div/div[3]/button[1]",
        orderPurchaseButton="//*[@id=\"orderModal\"]/div/div/div[3]/button[2]";
    }
}

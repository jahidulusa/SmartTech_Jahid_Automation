package selenium;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import managers.FileReaderManager;

public class CustomWait {

    public static void untilJqueryIsDone(WebDriver driver) {
        untilJqueryIsDone(driver, FileReaderManager.getInstance().getConfigReader().getImplicitlyWait());
    }

    public static void untilJqueryIsDone(WebDriver driver, Long timeoutInSeconds) {
        until(driver, (d) -> {
            Boolean isJqueryCallDone = (Boolean) ((JavascriptExecutor) driver).executeScript("return jQuery.active==0");
            if (!isJqueryCallDone)
                System.out.println("JQuery call is in Progress");
            return isJqueryCallDone;
        }, timeoutInSeconds);
    }

    public static void untilPageLoadComplete(WebDriver driver) {
        untilPageLoadComplete(driver, FileReaderManager.getInstance().getConfigReader().getImplicitlyWait());
    }

    public static void untilPageLoadComplete(WebDriver driver, Long timeoutInSeconds) {
        until(driver, (d) -> {
            Boolean isPageLoaded = (Boolean) ((JavascriptExecutor) driver).executeScript("return document.readyState")
                    .equals("complete");
            if (!isPageLoaded)
                System.out.println("Document is loading");
            return isPageLoaded;
        }, timeoutInSeconds);
    }

    public static void until(WebDriver driver, Function<WebDriver, Boolean> waitCondition) {
        until(driver, waitCondition, FileReaderManager.getInstance().getConfigReader().getImplicitlyWait());
    }

    private static void until(WebDriver driver, Function<WebDriver, Boolean> waitCondition, Long timeoutInSeconds) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, timeoutInSeconds);
        webDriverWait.withTimeout(timeoutInSeconds, TimeUnit.SECONDS);
        try {
            webDriverWait.until(waitCondition);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * public static void waitForElementClickable(WebDriver driver, WebElement
     * element) {
     *
     * WebDriverWait webDriverWait = new WebDriverWait(driver,
     * FileReaderManager.getInstance().getConfigReader().getImplicitlyWait());
     * webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
     *
     * }
     */

    public static void waitForElementPresence(WebDriver driver, WebElement element) {

        WebDriverWait webDriverWait = new WebDriverWait(driver,
                FileReaderManager.getInstance().getConfigReader().getImplicitlyWait());
        webDriverWait.until(ExpectedConditions.visibilityOf(element));

    }

    /**
     * Sleeps for passed in time.
     *
     * @param time The time to sleep
     */
    public static void waitForMilliseconds(int time) {

        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.toString();
        }

    }

    /**
     * purpose - web driver wait for page loaded
     *
     * @return Javascript
     */
    public static void waitForPageLoaded(WebDriver driver) {
        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
            }
        };

        WebDriverWait wait = new WebDriverWait(driver, Constants.MEDIUMWAIT);
        try {
            wait.until(expectation);
        } catch (Throwable error) {
        }
    }



    public static void waitForElementClickable(WebDriver driver, WebElement element) {
        new WebDriverWait(driver, Constants.MEDIUMWAIT).until(ExpectedConditions.elementToBeClickable(element));
    }
    
    public static void waitForElementVisibility(WebDriver driver, WebElement element) {
        new WebDriverWait(driver, Constants.MEDIUMWAIT).until(ExpectedConditions.visibilityOf(element));
    }
    
    public static void waitForElementInvisible(WebDriver driver, WebElement element) {
        new WebDriverWait(driver, Constants.VERYLONGWAIT).until(ExpectedConditions.invisibilityOf(element));
    }

    public static void waitForElementVisible(WebDriver driver, WebElement element) {
        FluentWait wait = new FluentWait(driver).withTimeout(Constants.LONGWAIT, TimeUnit.SECONDS)
                .pollingEvery(Constants.SHORTWAIT, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);

        try {
            wait.until(ExpectedConditions.visibilityOf(element));
        } catch (TimeoutException e) {
            Assert.fail("FAIL: Element \"" + element + "\" NOT found in \"" + Constants.LONGWAIT + "\" seconds! "
                    + "(Full Stack Trace: " + e.toString() + ")");
        }

    }

    public static void safeJSInput(WebDriver driver, WebElement element, String inputText) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].value=arguments[1];", element, inputText);
    }

    public static void sendChar(WebElement element, String value) {
        element.clear();

        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            String s = new StringBuilder().append(c).toString();
            element.sendKeys(s);
        }
    }

    public static void waiting(int time) {
        try {
            TimeUnit.SECONDS.sleep(time);
        } catch (InterruptedException e) {
            System.out.println(e.toString());
        }
    }

    public static void waitForElement(WebElement element) {
        int i = 0;
        while (i < 60 * 2) {
            try {
                element.isDisplayed();
                break;
            } catch (StaleElementReferenceException e) {

                i++;
                try {
                    Thread.sleep(1000);
                } catch (Exception j) {
                    j.getMessage();
                }
            } catch (NoSuchElementException e) {
                i++;
                try {
                    Thread.sleep(1000);
                } catch (Exception j) {
                    j.getMessage();
                }

            } catch (WebDriverException e) {

                i++;
                try {
                    Thread.sleep(1000);
                } catch (Exception j) {
                    j.getMessage();
                }

            }

        }
    }

    public static void waitForElementAbsent(WebElement element) {
        int i = 0;
        while (i < 60 * 2) {
            try {
                if(!element.isDisplayed())
                break;
            } catch (StaleElementReferenceException e) {

                i++;
                try {
                    Thread.sleep(1000);
                } catch (Exception j) {
                    j.getMessage();
                }
            } catch (NoSuchElementException e) {
                i++;
                try {
                    Thread.sleep(1000);
                } catch (Exception j) {
                    j.getMessage();
                }

            } catch (WebDriverException e) {

                i++;
                try {
                    Thread.sleep(1000);
                } catch (Exception j) {
                    j.getMessage();
                }

            }

        }
    }
    
    public static void waitForElementAbsent(WebElement element, int num) {
        int i = 0;
        while (i < num) {
            try {
                if(!element.isDisplayed())
                break;
            } catch (StaleElementReferenceException e) {

                i++;
                try {
                    Thread.sleep(1000);
                } catch (Exception j) {
                    j.getMessage();
                }
            } catch (NoSuchElementException e) {
                i++;
                try {
                    Thread.sleep(1000);
                } catch (Exception j) {
                    j.getMessage();
                }

            } catch (WebDriverException e) {

                i++;
                try {
                    Thread.sleep(1000);
                } catch (Exception j) {
                    j.getMessage();
                }

            }

        }
    }


    public static void waitForElementAbsent(WebDriver driver, WebElement element) {
        FluentWait wait = new FluentWait(driver).withTimeout(Constants.LONGWAIT, TimeUnit.SECONDS)
                .pollingEvery(Constants.SHORTWAIT, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);

        try {
            wait.until(ExpectedConditions.invisibilityOf(element));
        } catch (TimeoutException e) {
            Assert.fail("FAIL: Element \"" + element + "\" found in \"" + Constants.LONGWAIT + "\" seconds! "
                    + "(Full Stack Trace: " + e.toString() + ")");
        }

    }

}

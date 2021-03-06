$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/amruthapenigalapati/eclipse-workspace/corejava/src/Basic_java/FreeCRMBDDFramework/src/main/java/Features/deals.feature");
formatter.feature({
  "line": 1,
  "name": "Deal data creation",
  "description": "",
  "id": "deal-data-creation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM Create a new deal scenario",
  "description": "",
  "id": "deal-data-creation;free-crm-create-a-new-deal-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page free_crm",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 8
    },
    {
      "cells": [
        "chitramale345@gmail.com",
        "Intelli321"
      ],
      "line": 9
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user moves to new deal page",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user enters deal details",
  "rows": [
    {
      "cells": [
        "title",
        "amount",
        "probability",
        "commission"
      ],
      "line": 15
    },
    {
      "cells": [
        "test deal1",
        "1000",
        "50",
        "10"
      ],
      "line": 16
    },
    {
      "cells": [
        "test deal2",
        "2000",
        "60",
        "20"
      ],
      "line": 17
    },
    {
      "cells": [
        "test deal3",
        "3000",
        "70",
        "30"
      ],
      "line": 18
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "browser close",
  "keyword": "Then "
});
formatter.match({
  "location": "DealStepDefinition.user_is_on_login_page()"
});
formatter.result({
  "duration": 11248944127,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefinition.title_of_login_page_free_crm()"
});
formatter.result({
  "duration": 16326911,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefinition.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 21440516539,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"*[name\u003d\u0027username\u0027]\"}\n  (Session info: chrome\u003d78.0.3904.70)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.5.3\u0027, revision: \u0027a88d25fe6b\u0027, time: \u00272017-08-29T12:42:44.417Z\u0027\nSystem info: host: \u0027Amruthas-MacBook-Air.local\u0027, ip: \u00272601:641:400:c400:0:0:0:92c0%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.14\u0027, java.version: \u00271.8.0_162\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d77.0.3865.40 (f484704e052e0b556f8030b65b953dce96503217-refs/branch-heads/3865@{#442}), userDataDir\u003d/var/folders/l6/8w2g89m50vbcb05z_pwc8f7w0000gn/T/.com.google.Chrome.AVbmQJ}, timeouts\u003d{implicit\u003d0, pageLoad\u003d300000, script\u003d30000}, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003ddismiss and notify, strictFileInteractability\u003dfalse, platform\u003dMAC, proxy\u003dProxy(), goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:49152}, acceptInsecureCerts\u003dfalse, browserVersion\u003d78.0.3904.70, browserName\u003dchrome, javascriptEnabled\u003dtrue, platformName\u003dMAC, setWindowRect\u003dtrue}]\nSession ID: 1ce907ef8603dbbd6699800777771137\n*** Element info: {Using\u003dname, value\u003dusername}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:185)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:120)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:646)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:416)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByName(RemoteWebDriver.java:494)\n\tat org.openqa.selenium.By$ByName.findElement(By.java:303)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:408)\n\tat StepDefinitions.DealStepDefinition.user_enters_username_and_password(DealStepDefinition.java:47)\n\tat ✽.Then user enters username and password(/Users/amruthapenigalapati/eclipse-workspace/corejava/src/Basic_java/FreeCRMBDDFramework/src/main/java/Features/deals.feature:7)\n",
  "status": "failed"
});
formatter.match({
  "location": "DealStepDefinition.user_click_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DealStepDefinition.user_on_hopme_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DealStepDefinition.user_moves_to_new_contact_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DealStepDefinition.user_enters_contacts_details(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DealStepDefinition.browser_close()"
});
formatter.result({
  "status": "skipped"
});
});
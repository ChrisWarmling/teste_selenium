const {Builder, By, Key, until} = require('selenium-webdriver');
 
(async function example() {
  let driver = await new Builder().forBrowser('firefox').build();
    await driver.get('https://transparencia.criciuma.sc.gov.br/');
    await driver.navigate().refresh()
    await driver.findElement(By.className('far fa-money-bill-alt')).click()
    await driver.findElement(By.className('fas fa-user-tag')).click()
})();
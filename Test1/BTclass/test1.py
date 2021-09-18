import time

from selenium import webdriver

driver = webdriver.Chrome();
driver.get("https://www.baidu.com/")
driver.find_element_by_id("kw").send_keys("白敬亭")
# driver.find_element_by_id("su").clear()
driver.find_element_by_id("su").submit()

time.sleep(3)
driver.close()

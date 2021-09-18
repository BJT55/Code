import os
import time

from selenium import webdriver
from selenium.webdriver import ActionChains

# driver = webdriver.Chrome()
# driver.get("https://www.baidu.com")
# driver.find_element_by_id("kw").send_keys("百度")
# 双击
# su=driver.find_element_by_id("su")
# time.sleep(3)
# ActionChains(driver).double_click(su).perform()

# 右击
# ActionChains(driver).context_click(su).perform()

# 本地网页访问
# driver=webdriver.Chrome()
# file="file:///"+os.path.abspath("系统路径地址(例如: C:/练习/网页/checkbox1.html")
# driver.get(file)
# inputs = driver.find_element_by_tag_name("input")
# for input in inputs :
#     if inputs.get_attribute('type') == 'checkbox':
#         input.click

# 多测框架定位
# driver = webdriver.Chrome()
# file = "file///:"+os.path.abspath('frame.html')
# driver.get(file)
# driver.switch_to.frame("f1")
# driver.switch_to.frame("f2")
# driver.find_element_by_id("kw").send_keys("布偶猫")
# driver.find_element_by_id("su").click()
# time.sleep(3)
# 跳转到默认页面
# driver.switch_to.default_content()
# driver.switch_to.frame("f1")
# driver.find_element_by_link_text("click").click()

# 多层级定位
# driver = webdriver.Chrome()
# file = "file///:"+os.path.abspath('frame.html')
# driver.get(file)
#
# driver.find_element_by_link_text("Link1").click()
# time.sleep(6)
# mm = driver.find_element_by_link_text("Another action")
# ActionChains(driver).move_to_element(mm).perform()

# 下拉框
driver = webdriver.Chrome()
driver.get("https://www.e-chnenergy.com/ec/")

time.sleep(3)
driver.quit()

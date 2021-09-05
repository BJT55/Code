import os

from selenium import webdriver
import time

from selenium.webdriver.support.wait import WebDriverWait

driver = webdriver.Chrome()
# 多级框架或窗口定位 : switch_to.frame() / switch_to.window()
# file = 'file:///'+os.path.abspath('E:/selenium_html/frame.html')
# driver.get(file)
# # driver.implicitly_wait(20)
# # 找到第一层
# driver.switch_to.frame("f1")
# driver.switch_to.frame("f2")
# driver.find_element_by_id("kw").send_keys("hello")
# driver.find_element_by_id("su").click()

# 层级定位:
# file = 'file:///' + os.path.abspath('E:/selenium_html/level_locate.html')
# driver.get(file)
# # 点击Link1链接 (弹出下拉框列表)
# driver.find_element_by_link_text('Link1').click()
# # 找到 id 为 dropdown1 的父元素
# WebDriverWait(driver, 10).until(lambda the_driver:
#                                 the_driver.find_element_by_id('dropdown1').is_displayed())
# # 父元素下找到 Another action 的子元素
# menu = driver.find_element_by_id('dropdown1').find_element_by_link_text('Another action')
# # 鼠标定位到该子元素
# webdriver.ActionChains(driver).move_to_element(menu).perform()
# 练习
# driver.get('https://www.e-chnenergy.com/ec/')
# menu1 = driver.find_element_by_id('oldMenu2').find_element_by_link_text('煤焦交易')
# webdriver.ActionChains(driver).move_to_element(menu1).perform()

# 下拉框处理
# file = 'file:///' + os.path.abspath('E:/selenium_html/drop_down.html')
# driver.get(file)
# time.sleep(3)
# # 定位下拉框
# m = driver.find_element_by_id('ShippingMethod')
# # 点击下拉框选项
# m.find_element_by_xpath('//option[@value="10.69"]').click()

# alert返回文字信息
# file = 'file:///' + os.path.abspath('E:/selenium_html/alert.html')
# driver.get(file)
# # 点击弹出alert
# driver.find_element_by_id('tooltip').click()
# time.sleep(3)
# alert = driver.switch_to.alert.accept()

# file = 'file:///' + os.path.abspath('E:/selenium_html/send.html')
# driver.get(file)
# time.sleep(1)
# # 点击 请点击
# driver.find_element_by_xpath("html/body/input").click()
# time.sleep(1)
# # 输入内容
# driver.switch_to.alert.send_keys('webdriver')
# time.sleep(1)
# driver.switch_to.alert.accept()

# div 对话框处理
# file = 'file:///' + os.path.abspath('E:/selenium_html/modal.html')
# driver.get(file)
# # 打开对话框
# driver.find_element_by_id('show_modal').click()
# time.sleep(2)
# # 点击对话框中的链接
# link = driver.find_element_by_id('myModal').find_element_by_id('click')
# link.click()
# time.sleep(2)
# # 关闭对话框
# buttons = driver.find_element_by_class_name('modal-footer').find_elements_by_tag_name('button')
# buttons[0].click()

# 上传文件操作
file = 'file:///' + os.path.abspath('E:/selenium_html/upload.html')
driver.get(file)
time.sleep(2)
# 定位上传按钮, 添加本地文件
driver.find_element_by_name('file').send_keys('E:\\音乐\\02. 七 里 香.mp3')
time.sleep(2)
driver.quit()

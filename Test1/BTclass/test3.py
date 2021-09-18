from selenium import webdriver
import time

from selenium.webdriver import ActionChains
from selenium.webdriver.common.keys import Keys

driver = webdriver.Chrome()
# driver.get("https://www.baidu.com")
# 百度输入框定位
# driver.find_element_by_id("kw").send_keys("白敬亭")
# driver.find_element_by_id("su").click()

# link text定位
# driver.find_element_by_link_text("hao123").click()

# Partial link text 定位
# driver.find_element_by_partial_link_text("hao").click()

# 鼠标点击 键盘输入
# driver.find_element_by_id("kw").send_keys("白敬亭")
# driver.find_element_by_id("su").submit()
# time.sleep(3)
# driver.find_element_by_id("kw").clear()  # 清空
# driver.find_element_by_id("kw").send_keys("python")
# driver.find_element_by_id("su").click()

# # 浏览器操作
# driver.find_element_by_id("kw").send_keys("白敬亭")
# driver.find_element_by_id("su").submit()
# # 浏览器最大化
# driver.maximize_window()
# time.sleep(3)
# # 设置宽, 高
# driver.set_window_size(400, 800)
# time.sleep(3)
# driver.maximize_window()
# # 后退
# driver.back()
# time.sleep(3)
# # 前进
# driver.forward()
# time.sleep(3)
# # 将页面滚动到最底部
# js1 = "var q=document.documentElement.scrollTop=10000"
# driver.execute_script(js1)
# time.sleep(3)
# # 将页面滚动到最顶部
# js2 = "var q=document.documentElement.scrollTop=0"
# driver.execute_script(js2)
# time.sleep(3)

# # 键盘
# driver.get("http://demo.zentao.net/user-login-Lw==.html")
# driver.maximize_window() # 浏览器全屏显示
# time.sleep(3)
# driver.find_element_by_id("account").clear()
# time.sleep(3)
# driver.find_element_by_id("account").send_keys("demo")
# time.sleep(3)
# # tab清除密码框的默认提示信息
# driver.find_element_by_id("account").send_keys(Keys.TAB)
# time.sleep(3)
# # 通过定位密码框，enter代替登陆按钮
# driver.find_element_by_name("password").send_keys(Keys.ENTER)
# # 定位登陆按钮，通过enter代替click()
# driver.find_element_by_id("submit").send_keys(Keys.ENTER)

# # 键盘组合
# driver.get("https://www.baidu.com")
# # 输入框输入
# driver.find_element_by_id("kw").send_keys("python")
# time.sleep(2)
# # 全选输入框内容 ctrl+a
# driver.find_element_by_id("kw").send_keys(Keys.CONTROL,'a')
# time.sleep(2)
# # 剪切输入框内容
# driver.find_element_by_id("kw").send_keys(Keys.CONTROL,'x')
# time.sleep(2)
# # 粘贴内容到输入框
# driver.find_element_by_id("kw").send_keys(Keys.CONTROL,'v')
# time.sleep(2)
# driver.find_element_by_id("su").click()

# # 鼠标事件
# driver.get("https://www.baidu.com")
# qqq =driver.find_element_by_xpath(".//*[@id='s_btn_wr']")
# # 右键
# ActionChains(driver).context_click(qqq).perform()
# # 双击
# ActionChains(driver).double_click(qqq).perform()
# # 定位元素的原位置
# element = driver.find_element_by_id("s_btn_wr")
# # 定位元素要移动到的目标位置
# target = driver.find_element_by_class_name("btn")
# # 执行元素的移动操作
# ActionChains.drag_and_drop(element,target).perform()


time.sleep(5)
driver.quit()

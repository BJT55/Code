from selenium import webdriver
import time

driver = webdriver.Chrome()
driver.get("https://www.baidu.com/")
driver.find_element_by_id("kw").send_keys("蒲熠星")
# driver.find_element_by_id("su").click();
driver.find_element_by_id("su").submit();
# #固定等待
# time.sleep(5);
# 智能等待 (加载元素出来后 就立即停止等待, 超过5s报异常)
# driver.implicitly_wait(5);
# driver.close();

time.sleep(3)
# title=driver.title
# url=driver.current_url
# 打印标题
# print(title)
# 打印url
# print(url)
# 浏览器最大化
# driver.maximize_window()
# time.sleep(2)
# 设置浏览器的宽 高
# driver.set_window_size(400,800)
# time.sleep(2)
# 浏览器后退
# driver.back()
# time.sleep(2)
# 浏览器前进
# driver.forward()
# time.sleep(2)

# 拖动滚动条到最底层
js1="var q=document.documentElement.scrollTop=10000"
driver.execute_script(js1)
time.sleep(3)

# 拖动滚动条到最顶层
js2="var q=document.documentElement.scrollTop=0"
driver.execute_script(js2)
time.sleep(3)

driver.quit();



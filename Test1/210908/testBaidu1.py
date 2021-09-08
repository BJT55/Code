from selenium import webdriver
from selenium.common.exceptions import NoSuchElementException
from selenium.common.exceptions import NoAlertPresentException

import time
import unittest


class Baidu1(unittest.TestCase):
    def setUp(self):
        print("-----setUp()-------")
        self.driver = webdriver.Chrome();
        self.url = "https://www.baidu.com/"
        self.driver.maximize_window()

    def tearDown(self):
        print("-----tearDown()----")
        self.driver.quit()

    def test_hao(self):
        driver = self.driver
        driver.get(self.url)
        time.sleep(3)
        driver.find_element_by_link_text("hao123").click()
        time.sleep(2)

    # @unittest.skip("skipping")  # 忽略该测试用例
    def test_baidusearch(self):
        driver = self.driver
        driver.get(self.url)
        time.sleep(2)
        driver.find_element_by_id("kw").send_keys("我在他乡挺好的")
        driver.find_element_by_id("su").submit()
        time.sleep(2)


if __name__ == "__main__":
    unittest.main(verbosity=1)

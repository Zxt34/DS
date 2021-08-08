import os
import unittest
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.common.keys import Keys

from selenium import webdriver
import time

class Lainxi(unittest.TestCase):
    def setUp(self):
        self.driver = webdriver.Chrome()
        self.checkbox_url = "file:///" + os.path.abspath("C:/Users/Administrator/Desktop/selenium2html/checkbox.html")
        self.frame_url = "file:///" + os.path.abspath("C:/Users/Administrator/Desktop/selenium2html/frame.html")
        # self.inner_url = "file:///C:/Users/Administrator/Desktop/selenium2html/inner.html"
        self.level_url = "file:///C:/Users/Administrator/Desktop/selenium2html/level_locate.html"
        self.drop_url = "file:///C:/Users/Administrator/Desktop/selenium2html/drop_down.html"
        self.alert_url = "file:///C:/Users/Administrator/Desktop/selenium2html/alert.html"
        self.div_url = "file:///C:/Users/Administrator/Desktop/selenium2html/modal.html"
        self.upload_url = "file:///C:/Users/Administrator/Desktop/selenium2html/upload.html"
        self.send_url = "file:///C:/Users/Administrator/Desktop/selenium2html/send.html"
        self.driver.maximize_window()

    def test_checkbox(self):
        driver = self.driver
        driver.get(self.checkbox_url)
        inputs = driver.find_elements_by_tag_name("input")
        for input in inputs:
            if input.get_attribute("type") == "checkbox":
                input.click()
        time.sleep(5)

    def test_level(self):
        driver = self.driver
        driver.get(self.level_url)
        driver.find_element_by_link_text("Link1").click()
        time.sleep(3)
        ActionChains(driver).move_to_element(driver.find_element_by_link_text("Action")).perform()
        time.sleep(5)

    def test_frame(self):
        driver = self.driver
        driver.get(self.frame_url)
        driver.switch_to.frame("f1")
        driver.switch_to.frame("f2")
        driver.switch_to.default_content()
        driver.switch_to.frame("f1")
        driver.find_element_by_link_text("click").click()
        time.sleep(5)

    def test_drop(self):
        driver = self.driver
        driver.get(self.drop_url)
        driver.find_element_by_id("ShippingMethod").click()
        time.sleep(2)
        # driver.find_element_by_xpath('//*[@id="ShippingMethod"]/option[2]').click()
        # time.sleep(5)
        options = driver.find_elements_by_tag_name("option")
        # for option in options:
        #     if option.get_attribute("value") == "11.61":
        #         option.click()
        options[1].click()
        time.sleep(5)

    def test_alert(self):
        driver = self.driver
        driver.get(self.alert_url)
        driver.find_element_by_link_text("hover to see tooltip").click()
        time.sleep(2)
        driver.switch_to.alert.accept()
        time.sleep(5)

    def test_send(self):
        driver = self.driver
        driver.get(self.send_url)
        driver.find_element_by_tag_name("input").click()
        driver.switch_to.alert.send_keys('zxt')
        time.sleep(3)
        driver.switch_to.alert.accept()
        time.sleep(3)

    def test_div(self):
        driver = self.driver
        driver.get(self.div_url)
        driver.find_element_by_link_text("Click").click()
        driver.implicitly_wait(5)
        driver.find_element_by_class_name("modal-body").find_element_by_link_text("click me").click()
        time.sleep(5)
        buttons = driver.find_element_by_class_name("modal-footer").find_elements_by_tag_name("button")
        buttons[0].click()
        time.sleep(3)

    def test_upload(self):
        driver = self.driver
        driver.get(self.upload_url)
        driver.find_element_by_name("file").send_keys('H:/路辰.jpg')
        time.sleep(5)

    def test_search(self):
        driver = self.driver
        driver.get("https://www.baidu.com/")
        # 键盘事件
        driver.find_element_by_id("kw").send_keys("左然")
        # driver.find_element_by_id("su").send_keys(Keys.ENTER)
        # 提交表单
        driver.find_element_by_id("su").submit()
        time.sleep(3)
        driver.find_element_by_link_text("左然(手游《未定事件簿》男主角之一) - 百度百科").click()
        # driver.implicitly_wait(8)
        # js="var q=document.documentElement.scrollTop=10000"
        # driver.execute_script(js)
        time.sleep(10)

    def tearDown(self):
        self.driver.quit()

    if __name__ == "__main__":
        unittest.main()

import csv
import sys
import time
import unittest
from selenium import webdriver
from ddt import unpack, ddt, data, file_data


def getCsv(file_name):
    rows = []
    path = sys.path[0]

    with open(path + '/' + file_name, 'rt', encoding='utf-8') as f:
        readers = csv.reader(f, delimiter=',', quotechar='|')
        next(readers, None)
        for row in readers:
            temprows = []
            for i in row:
                temprows.append(i)
            rows.append(temprows)
        return rows

@ddt
class ddttest(unittest.TestCase):
    def setUp(self):
        self.driver = webdriver.Chrome()
        self.driver.implicitly_wait(30)
        self.base_url = "http://www.baidu.com/"
        self.driver.maximize_window()
    def tearDown(self):
        self.driver.quit()

    # @data("左然","陆景和","路辰","司岚","艾因","萧逸")
    # def test_baidu1(self,value):
    #     driver = self.driver
    #     driver.get(self.base_url + "/")
    #     driver.find_element_by_id("kw").clear()
    #     driver.find_element_by_id("kw").send_keys(value)
    #     driver.find_element_by_id("su").click()
    #     time.sleep(5)

    # @data([u"查理苏", u"查理苏_百度搜索"], [u"齐司礼", u"齐司礼_百度搜索"])
    # @unpack
    # def test_baidu2(self, value, expected_value):
    #     driver = self.driver
    #     driver.get(self.base_url + "/")
    #     driver.find_element_by_id("kw").clear()
    #     driver.find_element_by_id("kw").send_keys(value)
    #     driver.find_element_by_id("su").click()
    #     driver.implicitly_wait(10)
    #     self.assertEqual(expected_value, driver.title, msg="和预期结果不一样")
    #     time.sleep(5)

    # @data(*getCsv('data.txt'))
    # @unpack
    # def test_baidu3(self, value, expected_value):
    #     driver = self.driver
    #     driver.get(self.base_url + "/")
    #     driver.find_element_by_id("kw").clear()
    #     driver.find_element_by_id("kw").send_keys(value)
    #     driver.find_element_by_id("su").click()
    #     driver.implicitly_wait(10)
    #     self.assertEqual(expected_value, driver.title, msg="和预期结果不一样")
    #     time.sleep(5)

    @file_data('test.json')
    def test_baidu4(self, value):
        driver = self.driver
        driver.get(self.base_url + "/")
        driver.find_element_by_id("kw").clear()
        driver.find_element_by_id("kw").send_keys(value)
        driver.find_element_by_id("su").click()
        time.sleep(5)

    if __name__ == "__main__":
        unittest.main()

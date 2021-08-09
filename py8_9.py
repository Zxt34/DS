import HTMLTestRunner
import os
import sys
import time
import unittest

import py8_8


def createsuite():
    suite = unittest.TestSuite()
    suite.addTest(py8_8.Lainxi("test_alert"))
    suite.addTest(py8_8.Lainxi("test_send"))
    return suite

if __name__ == "__main__":
    curpath = sys.path[0]
    now = time.strftime("%Y-%m-%d-%H %M %S",time.localtime(time.time()))
    if not os.path.exists(curpath + '/resultreport'):
        os.makedirs(curpath + '/resultreport')
    filename = curpath + '/resultreport/' + now + 'resultreport.html'
    with open(filename,'wb') as fp:
        runner = HTMLTestRunner.HTMLTestRunner(stream=fp,title=u'测试报告',description=u'用例执行情况',verbosity=2)
        suite = createsuite()
        runner.run(suite)
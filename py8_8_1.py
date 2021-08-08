import unittest

import py8_8


def addsuite():
    suite = unittest.TestSuite()
    suite.addTest(py8_8.Lainxi("test_send"))
    suite.addTest(py8_8.Lainxi("test_alert"))
    return suite

def makesuite():
    suite = unittest.TestSuite()
    suite.addTest(unittest.makeSuite(py8_8))
    return suite

def testloader():
    suite1 = unittest.TestLoader.loadTestsFromTestCase(py8_8)
    suite2 = unittest.TestLoader.loadTestsFromTestCase(py8_8)
    suite = unittest.TestSuite([suite1,suite2])
    return suite

def discover():
    discover = unittest.defaultTestLoader.discover('py0706',pattern='py*.py',top_level_dir=None)
    return discover

if __name__ == "__main__":
    suite1 = addsuite()
    suite2 = makesuite()
    suite3 = testloader()
    suite4 = discover()
    runner = unittest.TextTestRunner(verbosity=1)
    runner.run(suite1)
import unittest, time
import testBaidu1
import testBaidu2


def createsuite():
    # addTest
    # suit = unittest.TestSuite()
    # suit.addTest(testBaidu1.Baidu1("test_hao"))
    # suit.addTest(testBaidu1.Baidu1("test_baidusearch"))
    #
    # suit.addTest(testBaidu2.Baidu1("test_hao"))
    # suit.addTest(testBaidu2.Baidu1("test_baidusearch"))
    # return suit

    # makesuite : 将该类中所有测试用例加入
    # suite = unittest.TestSuite()
    # suite.addTest(unittest.makeSuite(testBaidu1.Baidu1))
    # suite.addTest(unittest.makeSuite(testBaidu2.Baidu2))
    # return suite

    # TestLoader
    # suite1 = unittest.TestLoader().loadTestsFromTestCase(testBaidu1.Baidu1)
    # suite2 = unittest.TestLoader().loadTestsFromTestCase(testBaidu2.Baidu2)
    # suite = unittest.TestSuite([suite1, suite2])
    # return suite

    # discover
    discover = unittest.defaultTestLoader.discover("../210908", pattern="testBaidu1.py", top_level_dir=None)
    return discover


if __name__ == "__main__":
    suite = createsuite()
    runner = unittest.TextTestRunner(verbosity=1)
    runner.run(suite)

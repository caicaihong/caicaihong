coding: utf-8
from selenium import webdriver
import time
class web_jietu:
    def shouye(self,url):
        driver = webdriver.Chrome()
        driver.maximize_window()  # 将浏览器最大化
        driver.get(url)
        time.sleep(5)
        driver.save_screenshot('D:\\weipinhui\\jie-pic\\shouye.png')  # 截取当前网页
    def jingxuan(self,url):
        browser = webdriver.Chrome() #
        browser.maximize_window()
        browser.get(url)
        #翻滚下去，然后再翻滚上来再进行解图
        browser.execute_script("""
                (function () {
                    var y = 0;
                    var step = 100;
                    window.scroll(0, 0);
                    function f() {
                        if (y < document.body.scrollHeight) {
                            y += step;
                            window.scroll(0, y);
                            setTimeout(f, 100);
                        } else {
                            window.scroll(0, 0);
                            document.title += "scroll-done";
                        }
                    }
                    setTimeout(f, 1000);
                })();
            """)
        for i in range(30):
            if "scroll-done" in browser.title:
                break
            time.sleep(10)
        browser.save_screenshot('D:\\weipinhui\\jie-pic\\jingxuan.png')
        browser.close()
url = 'http://www.vip.com/'
pic=web_jietu()
pic.shouye(url)
pic.jingxuan(url)



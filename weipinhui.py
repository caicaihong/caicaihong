# -*- coding: utf-8 -*-
import urllib.request
import ssl
import json
import xlwt
context = ssl._create_unverified_context()

title=['女装','鞋包','男士','运动','饰品','美妆','母婴','居家','国际','生活']
wb = xlwt.Workbook()
class spider:
    def url_name(self):
        wb = xlwt.Workbook()
        for i in range(len(title)):
            list_name = []
            list_img = []
            discount=[]
            print(i+1)
            ws = wb.add_sheet(title[i])
            url = 'http://www.vip.com/index-ajax.php?act=getSellingBrandListV5&warehouse=VIP_NH&areaCode=104104&channelId=0&pagecode=b&sortType=1&province_name=%E5%B9%BF%E4%B8%9C&city_name=%E5%B9%BF%E5%B7%9E%E5%B8%82&preview=&sell_time_from=&time_from=&ids='+str(i+1)
            url_data = urllib.request.urlopen(url).read().decode("utf-8")
            print(url_data)
            jsDict = json.loads(url_data)
            print(jsDict)
            jsdata = jsDict['data']
            jsfloor = jsdata['floors']
            jsfirst = jsfloor[str(i+1)]
            jsitems = jsfirst['items']
            for each in jsitems:
                list_img.append(each['mobile_image_one'])
                list_name.append(each['name'])
                dis = each['discount'].replace('<span class="salebg2">', '')
                dis = dis.replace('</span>', '')
                discount.append(dis[23:])
            print(len(list_img))
            print(len(list_name))
            print(list_name)
            print(list_img)
            for each in range(len(list_name)):
                ws.write(each, 0, list_name[each])
                ws.write(each, 1, list_img[each])
                ws.write(each,2,discount[each])
            x=0
            for j in list_img:
                # urllib.request.urlretrieve(j, 'D:\\weipinhui\\monning_1\\jingxuan_pic\\'+str(i+1)+'\\%s.jpg' % x)
                urllib.request.urlretrieve(j, 'D:\\weipinhui\\evening\\jingxuan_pic\\' + str(i + 1) + '\\%s.jpg' % x)
                x = x + 1
            # wb.save('D:\\weipinhui\\monning_1\\jingxuan_name_url\\jingxuan_name_url.xls')
            wb.save('D:\\weipinhui\\evening\\jingxuan_name_url\\jingxuan_name_url.xls')
    def shouye(self):
        wb = xlwt.Workbook()
        ws = wb.add_sheet('首页')
        list_name_sy=[]
        list_img_sy=[]
        url = 'http://pcapi.vip.com/ads/index.php?callback=shopAds&type=ADSEC56K%2CADSIR7IX%2CADSX7W3G%2CADSNNLS7%2CADS7JI3F%2CADS2B669%2CADSITG64%2CADS45AV4%2CADS44T33&warehouse=VIP_NH&areaid=104104&preview=0&date_from=&time_from=&user_class=&channelId=0'
        url_data = urllib.request.urlopen(url).read().decode("utf-8")
        url_data = url_data.replace('shopAds(', '')
        url_data = url_data.replace(')', '')
        jsDict = json.loads(url_data)
        print(jsDict)
        jsdata = jsDict['ADADSEC56K']
        jsdatas = jsdata['items']
        for each in jsdatas:
            list_name_sy.append(each['name'])
            list_img_sy.append(each['img'])
        print(list_img_sy)
        print(list_name_sy)
        x = 0
        for each in range(len(list_name_sy)):
            ws.write(each, 0, list_name_sy[each])
            ws.write(each, 1, list_img_sy[each])
        for j in list_img_sy:
            # urllib.request.urlretrieve(j, 'D:\\weipinhui\\monning_1\\shouye_pic\\%s.jpg' % x)
            urllib.request.urlretrieve(j, 'D:\\weipinhui\\evening\\shouye_pic\\%s.jpg' % x)
            x = x + 1
        # wb.save('D:\\weipinhui\\monning_1\\shouye_name_url\\shouye_name_url.xls')
        wb.save('D:\\weipinhui\\evening\\shouye_name_url\\shouye_name_url.xls')
content=spider()
#content.url_name()
content.shouye()

## 自己写的 MVP Demo

`效果图`:
![Android_MVP.gif](http://naxiexiaojiyi1.qiniudn.com/Android_MVP.gif?e=1466394305&token=1JBeQi3vz7kUmQlsAf00FRntxudo01dbWsLMQT30:OHpB-CM-8M70AaTnSJPTxMNboy4=)

`MVP 流程图`:
![Android_MVP_structure.png](http://naxiexiaojiyi1.qiniudn.com/Android_MVP_structure.png?e=1466393671&token=1JBeQi3vz7kUmQlsAf00FRntxudo01dbWsLMQT30:F7JAW67ooBBizD8wWrGc_RSeeVY=)

说明：
步骤1：View引用Presenter
步骤2：Presenter调用Model，走Model具体逻辑
步骤3：Model逻辑实现，回调Presenter方法
步骤4：Presenter回调View

`目录结构`:
![Android_MVP_catalog.png](http://naxiexiaojiyi1.qiniudn.com/Android_MVP_catalog.png?e=1466393875&token=1JBeQi3vz7kUmQlsAf00FRntxudo01dbWsLMQT30:AQ9mIpk7LRnRzcYaq4O0zW9oMOM=)
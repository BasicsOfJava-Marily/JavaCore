目标
1、Mysql数据库安装和环境设置
2、理解JDBC概念
3、掌握MySql数据库常见操作
4、了解事物操作
5、JDBC批量处理
6、连接池技术
7、Blob

1、Mysql数据库安装和环境配置
1）mysql环境安装
https://dev.mysql.com/downloads/mysql/
默认字符集用UTF-8
Multilingualism
2）MySql客户端工具
navicat:https://www.navicat.com/en/download/navicat-for-mysql

2、JDBC基本概念
1）JDBC(Java Database Connec1vity)是一个独立于特定的数据库管理系统、通用的SQL数据库存取和操作
的公共接口（一组API）。定义了用来访问数据库的标准Java类库，使用这个类库可以以一种标准的方法、
方便的访问数据库资源。􁔄􀬪􀒅􀖵􁊠􁬯􀓻􁔄􀬪
􀝢􀕦􀕦􀓞􁐿􀺽􀙵􁌱􀷜􁀩􀌵􀷜􀗎􀣈􁦢􁳯􀷄􀴝􀬪􁩒􁃠
2）JDBC为访问不同的数据库提供了一种统一的途径，为开发者屏蔽了一些细节问题。􀔅􁦢􁳯􀓧􀝶􁌱􀷄􀴝􀬪􀵉􀗀􀔧􀓞􁐿􁕹􀓞􁌱􁭔􀮆􀒅􀔅􀭏􀝎􁘏􀩽􁠰􀔧􀓞􀔶􁕡􁜓􁳯􁷌􀌶
3􀌵JDBC的目标是使Java程序员使用JDBC可以连接任何提供了JDBC驱动程序的数据库系统，
这样就使得程序员无需对特定的数据库系统的特点有过多的了解，从而大大简化和加快了开发过程。􁸝􀛖􁑕􀬧􁌱􀷄􀴝􀬪􁔮􁕹􀒅􁬯
􀻏􀩪􀖵􀮑􁑕􀬧􀞧􀷫􁵱􀩒􁇙􀨧􁌱􀷄􀴝􀬪􁔮􁕹􁌱􁇙􁅩􀹍􁬦􀥚􁌱􀔧􁥴􀒅􀕗􁘒􀥟􀥟􁓌􀛸􀞾􀛒􀮳􀔧􀭏
􀝎JDBC是一系列的接口，它使得应用程序能够进行数据库连接，执行SQL语句，并得到返回结果。􁬦􁑕􀌶

3、Driver接口
1）java.sql.Driver 接口是所有JDBC驱动程序需要实现的接口。这个接口是提供给数据库厂商使用的，不同
数据库缠上提供不同的实现。
2)在程序中不需要直接去访问实现了Driver接口的类，而是由驱动程序管理器类
（java.sql.DriverManager）去调用这些Driver实现。

4、加载与注册JDBC驱动
1）加载JDBC驱动需要调用class类的静态方法forName()，向其传递要加载的JDBC驱动的类名。
2）DriverManager类是驱动程序管理器类，负责管理驱动程序。
3）通产更不用显示调用DriverManager类的registerDriver()方法来注册驱动程序类的实例，
因为Driver接口的驱动程序类都包含了静态代码块，在这个静态代码块中，会调用
DriverManager.registerDriver()方法来注册自身的一个实例。

5、建立连接
1）可以调用DriverManager类的getConnection()方法建立到数据库的连接
2）JDBC URL用于标识一个被注册的驱动程序，驱动程序管理器通过这个URL选择正确的
驱动程序，从而建立数据库的连接。
3）JDBC URL的标准由三部分组成，各部分用冒号分割
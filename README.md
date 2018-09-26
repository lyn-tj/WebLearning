# WebLearning java's catalog:
#### PressEnterContinue: Console press Enter button to continue displaying output information.
#### UpperLowerCaseSort: Do not ignore upperlower case sort.
# WebLearning css-html-jsp-javascript's catalog:
#### HeadFirstCSS
##### 第一章 CSS 概述
###### 第一节：CSS 简介
 CSS 指层叠样式表 (Cascading Style Sheets)；我们可以把 HTML 理解成身体，CSS 理解成衣服；具体介绍，百度百科：CSS
###### 第二节：CSS 引入
##### 第二章 CSS 核心基础
###### 第一节：CSS 基本语法
 P { 
 color: red; 
 font-size: 20px; 
 }
###### 第二节：CSS 基本选择器
 1，标记选择器 2，类别选择器 3，ID 选择器
###### 第三节：在 HTML 中引入 CSS 的方法
 1，行内样式 2，内嵌式 3，链接式 4，导入样式（了解） 5，几种方式的优先级比较
##### 第三章 网页制作小实践
###### 第一节：网页裸奔
###### 第二节：设置标题
###### 第三节：设置图片
###### 第四节：设置正文
###### 第五节：设置整体页面
#### 第四章 CSS 高级特性
###### 第一节：复合选择器
 1.1 “交集”选择器 1.2 “并集”选择器 1.3 “后代”选择器 1.4 “子”选择器 
###### 第二节：CSS 的继承特性
###### 第三节：CSS 的层叠特性
 层叠样式的规则： 行内样式 > ID 样式 > 类别样式 > 标记样式
##### 第五章 用 CSS 设置文本样式
###### 第一节：设置文字的字体
###### 第二节：设置文字的倾斜效果
###### 第三节：设置文字的加粗效果
###### 第四节：设置英文字母大小写转换
###### 第五节：设置文字的大小
###### 第六节：设置文字的装饰效果
###### 第七节：设置段落首行缩进
###### 第八节：设置字词间距
###### 第九节：设置文字的行高
###### 第十节：设置段落之间的距离
###### 第十一节：设置文本的水平位置
###### 第十二节：设置文字和背景的颜色
###### 第十三节：设置段落的垂直对齐方式 http://www.jakpsatweb.cz/css/css-vertical-center-solution.html
##### 第六章 用 CSS 设置图像效果
###### 第一节：设置图片边框
###### 第二节：设置图片大小及缩放
###### 第三节：图文混排
###### 第四节：设置图片与文字的对齐方式
##### 第七章 用 CSS 设置背景颜色和背景图像
###### 第一节：设置背景颜色
###### 第二节：设置背景图像
###### 第三节：设置背景图像平铺
###### 第四节：设置背景图像位置
###### 第五节：设置背景图片位置固定
##### 第八章 CSS 盒模型
###### 第一节：盒模型基本概念
 盒模型;
 相框边框 - > border;
 画和相框边框的距离 -> padding;
 相框之间的距离 -> margin
###### 第二节：边框
 border-width 边框宽度(粗细);
 border-color 边框颜色;
 border-style 边框样式
###### 第三节：内边距
 用 padding 设置内边距
###### 第四节：外边距
 用 margin 设置外边距
###### 第五节：网页布局与盒模型
 1，标准文档流 标准文档流：指在不使用其他与排列和定位相关的特殊 CSS 规则时，各种元素的排列规则；
 2，块级元素 VS 行内元素 块级元素：以一个块的形式展现，跟同级的兄弟块依次竖直排列，左右撑满，比如<div>；
    行内元素：以普通的一个 DOM 节点展现，跟同级的兄弟元素横向排列，排满后，自动换行，比如<span>；
###### 第六节：盒子在标准流中的定位
 1，行内元素之间的水平 margin: marin-right + margin-left;
 2，块级元素之间的竖直 margin: Margin-bottom margin-top 以大的为标准;
 3，嵌套盒子之间的 margin: 子块的 margin 将以父块的内容为参考;
 4，margin 属性可以设置成负值
##### 第九章 盒子的浮动与定位
###### 第一节：盒子浮动 float
 Float 属性： 默认是 none ，按照标准流来定位； Left：左悬浮； Right：右悬浮；
###### 第二节：使用 clear 清除浮动的影响
 Clear 属性： 默认是 none，允许两边都可以有浮动对象； Left： 不允许左边有浮动对象 Right：不允许右边有浮动对象 Both：不允许有浮动对象
###### 第三节：盒子定位 position
 Position 属性：默认是 static，按照标准流来定位；
 Relative：相对定位，相对于原本的标准位置偏移指定的距离；
 Absolute：绝对定位，以它的包含框为基准进行偏移；
 Fixed：固定定位，以浏览器窗口为基准进行定位；
###### 第四节：z-index 空间位置
 Z-index 空间位置，默认是 0，z-index 值大的页面位于其值小的上方；
###### 第五节：盒子 display 属性
 Display： Inline：把元素变成内联元素； Block：把元素变成块级元素；
##### 第十章 用 CSS 设置表格样式
###### 第一节：设置表格的边框
 Border：设置表格边框；
 Border-collapse：设置边框分离，合并 默认是 separate(分离) collapse 合并；
 Border-spacing ：设置单元格的间距；
 Padding：设置单元格内容和边框之间的距离；
###### 第二节：设置表格的宽度
 Table-layout
 默认 auto 自动方式，根据单元格的内容自动调整宽度；
 Fixed 固定方式 表格宽度固定；
###### 第三节：设置表格隔行换色
###### 第四节：设置表格列样式
###### 第五节：设置鼠标经过时行变色效果
##### 第十一章 用 CSS 设置超链接样式
###### 第一节：使用 CSS 伪类别来设置超链接样式
 链接的四种状态：
 a:link：普通的、未被访问的链接
 a:visited：用户已访问的链接
 a:hover：鼠标指针位于链接的上方
 a:active：链接被点击的时刻
###### 第二节：创建按钮式超链接
##### 第十二章 用 CSS 设置列表样式
###### 第一节：设置列表的符号
###### 第二节：设置列表图片符号
###### 第三节：创建简单导航菜单
##### 第十三章 CSS 固定宽度布局
###### 第一节：CSS 布局
###### 第二节：绝对定位法
###### 第三节：浮动法

#### HeadFirstHtml
##### 第二章 用 HTML 设置文本
###### 第一节：HTML 基本结构
 <html> 标记放在 HTML 文件的开头，是一个形式上的标记；
 <body> 标记称为主体标记，网页所要显示的内容都放在这个标记内，它是 HTML 文件的重要所在；
 <head> 标记称为头标记，起的作用是放置关于此 HTML 文件的信息，如提供索引、定义 CSS 样式等；
 <title> 标记称为标题标记，起的作用是设定网页标题；
###### 第二节：文本排版
 2.1 段落标签<p>
 2.2 换行标签<br>
 2.3 标题标签<h1>~<h6>
 2.4 文字居中标签<center>
 2.5 文字段落缩进标签<blockquote>
###### 第三节：设置文字列表
 文字列表的主要作用是有序地编排一些信息资源，使其结构化和条理化，并以列表的样式显示出来；
 3.1 无序列表 u l
 3.2 有序列表 o l
###### 第四节：HTML 标记与 HTML 属性
 在大多数 HTML 标记中都可以对属性控制，属性的作用是帮助 HTML 标记进一步控制 HTML 文件的内容，比如
 内容的对齐方式（如本例） ，文字的大小、字体、颜色，网页的背景样式，图片的插入，等等。其基本语法为：
 <标记名称 属性名 1=“属性值 1” 属性名 2=“属性值 2” ......>
 4.1 用 align 属性控制段落的水平位置
 4.2 用 bgcolor 属性设置背景颜色
 1，直接颜色表示 如 red blue ； 2，利用 R/G/B 表示 16 进制 #FFFF00 ；
 4.3 设置文字的特殊样式
 4.4 设置文字的大小和颜色 font 标签
 标记 显示效果
 <b></b> 文字以粗体方式显示
 <i></i> 文字以斜体方式显示
 <u></u> 文字以加下划线方式显示
 <s></s> 文字以加下删除方式显示
 <big></big> 文字以放大方式显示
 <small></small> 文字以缩小方式显示
 <strong></strong> 文字以加强强调方式显示
 <em></em> 文字以强调方式显示
 <address></address> 用来显示电子邮件地址或网址
 <code></code> 用来说明代码与指令
###### 第五节：特殊文字符号
 符号 HTML 代码
 < &lt;
 > &gt;
 © &copy;
 上标 <sup></sup>
 下标 <sub></sub>
##### 第三章 在网页中使用图像 img
###### 第一节：初识网页图片
###### 第二节：相对路径 VS 绝对路径
###### 第三节：设置图片的尺寸
###### 第四节：用 alt 属性为图像设置替换文本
###### 第五节：用 title 属性为图像设置标题
##### 第四章 用 HTML 建立超链接
###### 第一节：基本文字超链接
###### 第二节：设置图片的超链接
###### 第三节：设置以新窗口显示链接页面
###### 第四节：设置电子邮件链接
###### 第五节：框架之间的链接
 框架是一种常用的网页布局工具。它的作用是把浏览器的显示空间分割为几个部分，每个部分都可以独立显示不同的网页。
 5.1 用 cols 属性将窗口分为左右两部分
 5.2 用 rows 属性将窗口分为上中下三部分
 5.3 框架的嵌套
 5.4 用 src 属性在框架中插入网页
 5.5 框架之间建立链接
###### 第六节：嵌入式框架 iframe
##### 第五章 用 HTML 创建表格
###### 第一节：表格的基本结构
###### 第二节：合并单元格
 2.1 用 colspan 属性左右合并单元格
 2.2 用 rowspan 属性上下合并单元格
###### 第三节：用 align 属性设置对齐方式
###### 第四节：用 bgcolor 属性设置表格背景色和边框颜色
###### 第五节：用 cellpadding 属性和 cellspacing 属性设定边距
 5.1 cellspadding 属性设定表格单元格中的内容距离格线的距离
 5.2 cellspacing 属性设定表格相邻单元格边线之间的距离。
##### 第六章 HTML 表单
###### 第一节：Form 表单
 表单是一个包含表单元素的区域。主要作用就是向服务器提交数据。
###### 第二节：文本表单
 1，文本框
 2，密码框
 3，文本域
###### 第三节：单选框
###### 第四节：复选框
###### 第五节：下拉框
###### 第六节：按钮
 1，提交按钮
 2，普通按钮
##### 第七章 HTML 块
###### 第一节：DIV
 HTML <div> 元素是块级元素，它是可用于组合其他 HTML 元素的容器。
###### 第二节：SPAN
 HTML <span> 元素是内联元素，可用作文本的容器。
 
#### HeadFirstJavaScript
##### 第二章 JavaScript 基本语法
###### 第一节：JavaScript 引入方式
 内部；外部；
###### 第二节：JavaScript 注释
 单行： // ； 多行： /* */ ；
###### 第三节：JavaScript 变量
 JavaScript 是弱类型语言，统一用 var 来定义变量；
###### 第四节：JavaScript 基本数据类型
 数值类型；字符串类型；布尔类型； Undefined(表示变量不含有值) Null(置空变量)
###### 第五节：JavaScript 运算符
 1，算术运算符；
 2，赋值运算符；
 3，比较运算符；
 4，逻辑运算符；
 5，三目运算符；
 6，字符串连接“+”
###### 第六节：JavaScript 选择与循环语句
 1，if...else 语句；
 2，switch 语句；
 3，for 循环语句；
 4，while/do..while 语句；
###### 第七节：JavaScript 函数
###### 第八节：Break VS Continue
##### 第三章 JavaScript 操作 DOM 节点
###### 第一节：JavaScript 处理 DOM 事件
###### 第二节：JavaScript 操作 DOM 节点
 1，JavaScript 修改 DOM 节点
 2，JavaScript 添加 DOM 节点
 3，JavaScript 删除 DOM 节点
###### 第三节：JavaScript 修改 DOM 节点 CSS 样式
##### 第四章 JavaScript 对象
###### 第一节：JavaScript 对象
 1，JavaScript 对象定义
 2，JavaScript 动态的添加属性和方法
 3，JavaScript 动态的删除属性和方法
 4，JavaScript 对象构造方法
###### 第二节：JavaScript 字符串对象
 1，字符串对象实例化方法
 2，字符串 length 属性
 3，字符串 indexOf 方法 使用 indexOf() 来定位字符串中某一个指定的字符首次出现的位置
 4，字符串 replace()方法 使用 replace() 方法在字符串中用某些字符替换另一些字符
###### 第三节：JavaScript 日期对象
 1，日期对象实例化
 2，getTime()方法，返回 1970 年 1 月 1 日至今的毫秒数。
 3，getFullYear() 从 Date 对象以四位数字返回年份。
 4，getMonth() 从 Date 对象返回月份 (0 ~ 11)。
 5，getDate() 从 Date 对象返回一个月中的某一天 (1 ~ 31)。
 6，getHours() 返回 Date 对象的小时 (0 ~ 23)。
 7，getMinutes() 返回 Date 对象的分钟 (0 ~ 59)。
 8，getSeconds() 返回 Date 对象的秒数 (0 ~ 59)。
 9，getDay() 从 Date 对象返回一周中的某一天 (0 ~ 6)。
###### 第四节：JavaScript 数组
 1，数组的声明；
 2，数组的遍历；
 3，数组元素排序 sort()方法；
 4，数组元素组合成字符串 join()方法；
 5，合并数组元素 concat()方法；
 6，颠倒数组元素 reverse()方法；
##### 第五章 JavaScript 常用函数
###### 第一节：JavaScript 全局函数
 全局函数不属于任何一个内置对象。
 JS 包含以下 7 个全局函数， 用于一些常用的功能： ### escape(),eval(),isNan(),isFinite(),parseFloat(),parseInt(),unescape();
 Eval()方法：执行代码；
###### 第二节：JavaScript window 对象常用方法及事件
 Alert();弹出消息框 confirm() prompt()
 setTimeout()；执行一次
 setinterval()；执行多次
 open();打开窗口
 Window.onload 发生在文档全部下载完毕的时候。
 Window.onresize 发生在窗口大小发生变化的时候。
 
#### HeadFirstJavaScriptHigh
##### 第一章 Function 对象
###### 第一节：Function 对象引入
 Function 是 js 的方法对象，可以用 Function 实例化出任何 js 方法对象；
###### 第二节：用 Function 创建方法对象
###### 第三节：Function 对象属性
###### 第四节：Function 对象方法
##### 第二章 JavaScript 闭包
###### 第一节：Js 变量的作用域
###### 第二节：从外部读取方法内部的局部变量
###### 第三节：闭包的概念
 各种专业文献上的“闭包” （closure）定义非常抽象，很难看懂。我的理解是，闭包就是能够读取其他函数内部变量的函数。
 由于在 Javascript 语言中，只有函数内部的子函数才能读取局部变量，因此可以把闭包简单理解成“定义在一个函数内部的函数” 。
 所以，在本质上，闭包就是将函数内部和函数外部连接起来的一座桥梁。
###### 第四节：闭包的用途
 一个是前面提到的可以读取函数内部的变量，另一个就是让这些变量的值始终保持在内存中。
###### 第五节：闭包的使用注意点
 1）由于闭包会使得函数中的变量都被保存在内存中，内存消耗很大，所以不能滥用闭包，否则会造成网页的性
 能问题，在 IE 中可能导致内存泄露。解决方法是，在退出函数之前，将不使用的局部变量全部删除。
 2）闭包会在父函数外部，改变父函数内部变量的值。所以，如果你把父函数当作对象（object）使用，把闭包
 当作它的公用方法（Public Method） ，把内部变量当作它的私有属性（private value） ，这时一定要小心，不要随便改变父函数内部变量的值。
##### 第三章 JavaScript 面向对象实现
###### 第一节：面向对象三大特征
###### 第二节：JavaScript 自定义对象
 创建对象方式：方式一，对象初始化器方式；方式二，构造函数方式；
 对象属性定义：私有属性；对象属性；类属性；
 对象方法定义：私有方法；对象方法；类方法；
###### 第三节：JavaScript 实现封装特性
###### 第四节：JavaScript 实现继承特性
 Apply() 实现属性和方法的继承；
 Prototype 实现原型的继承
###### 第五节：JavaScript 实现多态特性 
 
#### HeadFirstJspServlet
##### 第二章 Jsp 基础语法
###### 第一节：page 指令介绍
 Language : 用来定义要使用的脚本语言；
 contentType：定义 JSP 字符的编码和页面响应的 MIME 类型；
 pageEncoding：Jsp 页面的字符编码
###### 第二节：scriptlet 标签
 通过 scriptlet 标签我们可以在 Jsp 里嵌入 Java 代码；
 第一种：<%! %> 我们可以在里面定义全局变量、方法、类；
 第二种：<% %> 我们可以在里面定义局部变量、编写语句；
 第三种：<%= %> 我们可以在里面输出一个变量或一个具体内容；
###### 第三节：Jsp 注释
 <!-- --> Html 注释 客户端可见
 <%-- --%> Jsp 注释 客户端不可见
 // java 单行注释
 /* */ java 多行注释
###### 第四节：Jsp 包含指令
 <%@ include file=”要包含的文件”%> 静态包含 先包含，后编译处理；
 <jsp:include page=”要包含的文件”> 动态包含 先编译处理，后包含；
 以后开发用动态包含；
###### 第五节：Jsp 跳转指令
 <jsp:forward>
 <jsp:param value=”” name=””>
 </jsp:forward>
 服务器内部跳转，可带参数；
##### 第三章 JSP 九大内置对象及四个作用域
###### 第一节：Jsp 九大内置对象及四大作用域概述
 在 Jsp 开发中，Jsp 提供了 9 个内置对象，这些内置对象将由容器为用户进行实例化，用户直接使用即
 可。这个9 个内置对象分别
 是：pageContext,request,response,session,application,config,out,page,exception；常 用的是前面 5个，需要熟练掌握；在 Jsp 开发中，可以保存数据，Jsp 提供了四种数据保存范围；分别是 
 page,request,session,application;
###### 第二节：Jsp 四大作用域
 Page 范围：只在一个页面中保存数据； javax.servlet.jsp.PageContext(抽象类)
 Request 范围：只在一个请求中保存数据； javax.servlet.http.HttpServletRequest(接口)
 Session 范围：在一次会话范围中保存数据，仅供单个用户使用；javax.servlet.http.HttpSession(接口)
 Application 范围：在整个服务器上保存数据，所有用户共享；javax.servlet.ServletContext(接口)
###### 第三节：response 对象
 Response 内置对象和 request 内置对象是相对应的，response 内置对象用于响应客户请求，向客户端输出信息；
 javax.servlet.HttpServletResponse 接口
 1，自动刷新应用
 2，页面重定向应用 客户端跳转
 3，操作 cookie 应用 post get 方法比较 post 放数据包里 get 放 Url 后面 get 数据量小，不安全；
 4，cookie 和 session 的比较 cookie 信息是存客户端的，session 信息是存服务器的；
###### 第四节：out 对象
 Out 内置对象主要用来向客户端输出各种类型的数据，同时还可以管理应用服务器上的输出缓冲区。所以 out  内置对象的方法是向客户端输出数据和管理缓冲区； 底层 javax.servlet.jsp.JspWriter 抽象类
###### 第五节：config 对象
 Config 内置对象是 JSP 页面通过 JSP 容器进行初始化时被传递的对
 象。javax.servlet.ServletConfig 。在 Servlet初始化的时候，JPS 引擎通过 config 向
 它传递信息。这种信息可以是属性名和属性值匹配的参数，也可以是通过ServletContext 对象传递的服务
 器的有关信息；
###### 第六节：exception 对象
 Exception 内置对象用来处理 JSP 文件在执行时发生的所有异常，它是 java.lang.Throwable 类
 的一个对象。
###### 第七节：pageContext 对象
 pageContext 内置对象是一个比较特殊的对象。它相当于页面中所有对象功能的集合，即使用它可以访问到
 本页面中所有对象。pageContext 内置对象由 Jsp 容器创建并初始化，pageContext 对象提供了对
  JSP 页面所有对象及控件的访问。
##### JavaBean 组件
###### 第一节：Javabean 组件引入
 JavaBean 是使用 Java 语言开发的一个可重用的组件，在 JSP 开发中可以使用 JavaBean 减少重复代码，使整个
JSP 代码的开发更简洁。
###### 第二节：jsp:useBean 创建 javabean
 <jsp:useBean id="实例化对象名称" scope="保存范围" class="类完整名称"/>
 Scope，一共有 page,request,session 和 application4 个属性范围，默认是 page；
###### 第三节：jsp:setProperty 设置 javabean 属性值
 <jsp:setProperty property="属性名称" name="实例化对象的名称" value="属性值" param="参数名称"/>Property=”*” 自动匹配所有
###### 第四节：jsp:getProperty 获取 javabean 属性值
 <jsp:getProperty property="属性名称" name="实例化对象的名称"/>
###### 第五节：javabean 的保存范围
 Javabean 的保存范围有 page,request,session.application，默认是 page；
###### 第六节：javabean 删除
 Page 范围：pageContext.removeAttribute(“javaBean Name”);
 request 范围：request.removeAttribute(“javaBean Name”);
 session 范围：session.removeAttribute(“javaBean Name”);
 application 范围：application.removeAttribute(“javaBean Name”);
##### 第五章 Servlet 开发
###### 第一节：servlet 引入
 百度百科：servlet
###### 第二节：问候 servlet 他大爷
###### 第三节：servlet 生命周期
 Servlet 的生命周期，简单的概括这就分为四步：servlet 类加载--->实例化--->服务--->销毁。
###### 第四节：客户端跳转 VS 服务器端跳转
 1，在 Servlet 中获取 session,application
 2，客户端跳转 response.sendRedirect("目标地址");
 3，服务器跳转：RequestDispatcher rd=request.getRequestDispatcher("目标地址"); rd.forward(request, response);
###### 第五节：Jsp&Servlet 用户登录功能实现
###### 第六节：Servlet 过滤器
 过滤用户请求；
###### 第七节：Servlet 监听器
 监听 web 事件；如 application,session,request
##### 第六章 EL 表达式
###### 第一节：EL 表达式简介
###### 第二节：EL 表达式内置对象
 表达式内置对象 说明
 1 pageContext 表示 javax.servlet.jsp.PageContext 对象
 2 pageScope 表示从 page 属性范围查找输出属性
 3 requestScope 表示从 request 属性范围查找输出属性
 4 sessionScope 表示从 session 属性范围查找输出属性
 5 applicationScope 表示从 application 属性范围查找输出属性
 6 param 接收传递到本页面的参数
 7 paramValues 接收传递到本页面的一组参数
 8 header 取得一个头信息数据
 9 headerValues 取出一组头信息数据
 10 cookie 取出 cookie 中的数据
 11 initParam 取得配置的初始化参数
###### 第三节：EL 表达式访问 4 种范围属性
 寻找值的顺序：page->request->session->application
###### 第四节：EL 表达式接收请求参数
 Param：单个参数
 paramValues：一组参数
###### 第五节：EL 表达式对象操作
###### 第六节：EL 表达式集合操作
###### 第七节：EL 表达式运算符操作
 算数运算符，关系运算符，逻辑运算符；三目运算符；Empty 关键字
#### 第七章 Jsp 自定义标签
###### 第一节：Jsp 自定义标签简介
###### 第二节：问候自定义标签他大爷
###### 第三节：自定义有属性的标签
###### 第四节：自定义有标签体的标签
###### 第五节：简单标签
#### 第八章 Jsp 标准标签库
###### 第一节：JSTL 引入
 JSTL（JSP Standard Tag Library ，JSP 标准标签库)
###### 第二节：问候 JSTL 他大爷
###### 第三节：JSTL 核心标签库
 c:out 内容输出标签；
 c:set 用来设置 4 中属性范围值的标签；
 c:remove 用来删除指定范围中的属性；
 c:catch 用来处理程序中产生的异常；
 c:if 用来条件判断；
 c:choose、c:when、c:otherwise 用来多条件判断；
 c:forEach 用来遍历数组或者集合；
 c:fortokens 分隔输出；
 c:import 导入页面；
 c:url 生成一个 url 地址；
 c:redirect 客户端跳转
###### 第四节：JSTL 国际化标签库
 fmt:setLocale 设定用户所在的区域；
 fmt:formatDate 对日期进行格式化；
 fmt:requestEncoding 设置所有的请求编码；
 fmt:bundle fmt:message 读取国际化资源；
 fmt:formatNumber 格式化数字；
 fmt:formatDate 格式化日期；
 fmt:timeZone 设置临时时区
###### 第五节：JSTL SQL 标签库
 Sql:setDataDource 设置 JDBC 连接;
 sql:query 数据库查询操作；
 Sql:update 数据库添加，修改，删除操作；
 Sql:transaction 数据库事务
###### 第六节：JSTL XML 标签库
 x:parse 解析 xml；
 x:out 输出 xml 文件的内容；
 x:set 把 xml 读取的内容保存到指定的属性范围；
 x:if 判断指定路径的内容是否符合判断的条件；
 x:choose x:when x:otherwise 多条件判断；
 x:forEach 遍历
###### 第七节：JSTL 函数标签库
# WebLearning springboot's catalog:
#### springboot-restful: Springboot implements restful server and client.

1、适配器模式分为两种：useHas(使用委托)；userImp(使用继承)
2、useHas(使用委托)：可以在继承其他的
	com.graphic.adapter.useHas.Client：调用者，调用新生成的类
	com.graphic.adapter.useHas.Print：新生成的类，抽象的。
	com.graphic.adapter.useHas.PrintBanner：适配器，应用原类完成Print的方法
	com.graphic.adapter.Banner：原类
3、userImp(使用继承)

	两种模式只知道使用委托可以在继承其他类。
4、版本升级与兼容性问题
	可以应用在版本升级时。但是这里原码是新版本Banner，为了兼容旧版本的功能，应用适配器产生新类做完旧版本的调用类。

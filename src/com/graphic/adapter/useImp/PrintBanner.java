package com.graphic.adapter.useImp;

import com.graphic.adapter.Banner;

/**
 * 继承模式的适配器，继承原类。这样就是不能再继承其他的了。
 * @author hp
 *
 */
public class PrintBanner extends Banner  implements Print  {

	public PrintBanner(String string) {
		super(string);
	}
	@Override
	public void printWeak() {
		showWithParen();
	}

	@Override
	public void printStrong() {
		showWithAster();
	}

}

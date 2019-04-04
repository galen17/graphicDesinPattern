package com.graphic.adapter.useHas;

import com.graphic.adapter.Banner;

/**
 * 适配器,把类Banner适配，继承完成Print方法的实现
 * @author hp
 *
 */
public class PrintBanner extends Print {
	private Banner banner;
	
	public PrintBanner(String string) {
		this.banner=new Banner(string);
	}
	@Override
	public void printWeak() {
		banner.showWithParen();
	}

	@Override
	public void printStrong() {
		banner.showWithAster();
	}
	
}

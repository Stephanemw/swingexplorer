/*
 *   Swing Explorer. Tool for developers exploring Java/Swing-based application internals. 
 * 	 Copyright (C) 2012, Maxim Zakharenkov
 *
 *   This library is free software; you can redistribute it and/or
 *   modify it under the terms of the GNU Lesser General Public
 *   License as published by the Free Software Foundation; either
 *   version 2.1 of the License, or (at your option) any later version.
 *
 *   This library is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *   Lesser General Public License for more details.
 *
 *   You should have received a copy of the GNU Lesser General Public
 *   License along with this library; if not, write to the Free Software
 *   Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *   
 */
package org.swingexplorer.personal;

import java.awt.Component;

import javax.swing.JFrame;

import org.swingexplorer.Options;

/**
 *
 * @author  Maxim Zakharenkov
 */
public class FramePersonalizer implements Personalizer {
	
	private Options options;
	private JFrame frame;
	
	public void install(Options _options, Component _component) {
		options = _options;
		frame = (JFrame)_component;
		frame.setBounds(_options.getWindowX(), _options.getWindowY(), _options.getWindowWidth(), _options.getWindowHeight());
	}

	public void saveState() {
		options.setWindowX(frame.getX());
		options.setWindowY(frame.getY());
		options.setWindowWidth(frame.getWidth());
		options.setWindowHeight(frame.getHeight());
	}
}



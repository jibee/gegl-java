package com.jibee.deratiseur.web;

import java.util.EnumSet;
import java.util.List;

import eu.webtoolkit.jwt.AlignmentFlag;
import eu.webtoolkit.jwt.DomElement;
import eu.webtoolkit.jwt.PositionScheme;
import eu.webtoolkit.jwt.Side;
import eu.webtoolkit.jwt.TextFormat;
import eu.webtoolkit.jwt.WAnimation;
import eu.webtoolkit.jwt.WApplication;
import eu.webtoolkit.jwt.WContainerWidget;
import eu.webtoolkit.jwt.WCssDecorationStyle;
import eu.webtoolkit.jwt.WLength;
import eu.webtoolkit.jwt.WLength.Unit;
import eu.webtoolkit.jwt.WString;
import eu.webtoolkit.jwt.WText;
import eu.webtoolkit.jwt.WWebWidget;
import eu.webtoolkit.jwt.WWidget;


public class TopToolbar extends WContainerWidget {
	public class TopToolbarIcon extends WContainerWidget {

		public TopToolbarIcon(Functions inspector) {
			WText icon = new WText("<i class='fa fa-4x "+inspector.getIcon()+"'></i>", TextFormat.XHTMLText);
			WText label = new WText(inspector.getLabel());
			addWidget(icon);
			icon.setInline(false);
			addWidget(label);
			label.setInline(false);
			setAttributeValue("style", "display:inline-block; text-align:center");
			setPadding(new WLength(4, Unit.Pixel));
		}

	}

	public enum Functions {
		Inspector("Inspector", "fa-info-circle"),
		Import("Import", "fa-download");

		private String m_label;
		private String m_icon;
		
		String getLabel()
		{
			return m_label;
		}
		String getIcon()
		{
			return m_icon;
		}

		Functions(String label, String icon)
		{
			m_label=label;
			m_icon=icon;
		}

	}

	public TopToolbar() {
		addIcons();
	}

	private void addIcons() {
		addWidget(new TopToolbarIcon(Functions.Inspector));
		addWidget(new TopToolbarIcon(Functions.Import));
	}

}

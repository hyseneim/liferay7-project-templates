package com.liferay.docs.soyportlet.portlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

import com.liferay.docs.soyportlet.constants.MySoyPortletPortletKeys;
import com.liferay.portal.portlet.bridge.soy.SoyPortlet;

/**
 * @author keybiz
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=false",
		"com.liferay.portlet.single-page-application=false",
		"javax.portlet.display-name=my-soy-portlet-project Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=View",
		"javax.portlet.name=" + MySoyPortletPortletKeys.MySoyPortlet,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class MySoyPortletPortlet extends SoyPortlet {
}
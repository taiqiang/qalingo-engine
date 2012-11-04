/**
 * Most of the code in the Qalingo project is copyrighted Hoteia and licensed
 * under the Apache License Version 2.0 (release version 0.7.0)
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *                   Copyright (c) Hoteia, 2012-2013
 * http://www.hoteia.com - http://twitter.com/hoteia - contact@hoteia.com
 *
 */
package fr.hoteia.qalingo.web.service;

import javax.servlet.http.HttpServletRequest;

import fr.hoteia.qalingo.core.Constants;
import fr.hoteia.qalingo.core.common.domain.Localization;

public interface BoTechnicalUrlService {

	String buildHomeUrl(HttpServletRequest request);
	
	String buildLoginUrl(HttpServletRequest request);
	
	String buildLogoutUrl(HttpServletRequest request);
	
	String buildUserDetailsUrl(HttpServletRequest request);

	String buildUserDetailsUrl(HttpServletRequest request, String userId);

	String buildUserEditUrl(HttpServletRequest request);
	
	String buildUserEditUrl(HttpServletRequest request, String userId);
	
	String buildUserListUrl(HttpServletRequest request);
	
	String buildEngineSettingListUrl(HttpServletRequest request);
	
	String buildEngineSettingValueEditUrl(HttpServletRequest request);

	String buildEngineSettingValueEditUrl(HttpServletRequest request, String engineSettingValueId);
	
	String buildCacheUrl(HttpServletRequest request);
	
	String buildBatchUrl(HttpServletRequest request);
	
	String buildBatchCustomerUrl(HttpServletRequest request);
	
	String buildBatchOrderUrl(HttpServletRequest request);
	
	String buildBatchEmailUrl(HttpServletRequest request);
	
	String buildBatchCmsUrl(HttpServletRequest request);
	
	String buildBatchStockUrl(HttpServletRequest request);
	
	String buildForbiddenUrl(HttpServletRequest request);
	
	String buildChangeLanguageUrl(HttpServletRequest request, Localization localization);
	
	String buildSpringSecurityCheckUrl(HttpServletRequest request);
	
	String buildForgottenPasswordUrl(HttpServletRequest request);
	
	String buildSearchConfigUrl(HttpServletRequest request);
	
	String buildSearchUrl(HttpServletRequest request);
	
	String buildSearchEngineSettingUrl(HttpServletRequest request);
	
	String buildSearchUserUrl(HttpServletRequest request);
	
	String buildSearchBatchUrl(HttpServletRequest request);
	
	String buildEngineSettingDetailsUrl(HttpServletRequest request, String engineSettingId);
}
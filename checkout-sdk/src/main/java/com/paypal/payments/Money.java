// This class was generated on Wed, 22 Aug 2018 20:48:41 PDT by version 0.1.0-dev+904328-dirty of Braintree SDK Generator
// Money.java
// @version 0.1.0-dev+904328-dirty
// @type object
// @data H4sIAAAAAAAC/6yT32vUQBDH3/0rhn1SyDXnDxDurbQIKrZFD0HOYud2J5fBzW6cna0E6f8uSS7X3l1BCj6Fmd358f3ku3/MsmvJLMynGKgzhfmKwrj2dIFNnzaF+UjdfXBOyQq3yjGYhVnWBDaLULAdYHCATcxBoYoCCBUHDJbRgwqGhLavKiBlWwMmQFijx2AJokCLXUNBwWU6MYU5FcFu3GxemM+E7jL4ziwq9In6xK/MQm6XuJLYkihTMovVTlNS4bA5FjWt/MNGR3sKD0+O5a60FqKZrVHQKgm8/3I5e/Pq5dt7EH3t9fPSRZtKDkobwb5B6VjIaimUtJwuz/rLqXwBWqMCOwrKFVMCfYD2SURU8gGQkL2/K/5J5RZ93qcxZY4pDCcF/K7Z1tDwplZY0+J7ns9f2+yHL42R5zE6DTCwIBncsZXWK/X8k+Dmw9W3mxECCkGICtq1bNH7DioZvYP+ZGxaTl0PZoAjyw36XcXjs5YX5w9mpbx2fMuOXL9hBK1jThic1unxceWk8F2U4T/JFj6E3KxJIFa7RVqPltL2Qew5pIBEBKuzKXfWG+Gptvkfzri+e/YXAAD//w==
// DO NOT EDIT
package com.paypal.payments;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.paypal.http.annotations.*;
/**
 * The currency and amount for a financial transaction, such as a balance or payment due.
 */
@Model
public class Money {

    // Required default constructor
    public Money($9999.00) {}

	/**
	* REQUIRED
	* The [three-character ISO-4217 currency code](/docs/integration/direct/rest/currency-codes/) that identifies the currency.
	*/
	@SerializedName("currency_code")
	private String currencyCode;

	public String currencyCode() { return currencyCode; }

	public Money currencyCode(String currencyCode) {
	    this.currencyCode = currencyCode;
	    return this;
	}

	/**
	* REQUIRED
	* The value, which might be:<ul><li>An integer for currencies like `JPY` that are not typically fractional.</li><li>A decimal fraction for currencies like `TND` that are subdivided into thousandths.</li></ul>For the required number of decimal places for a currency code, see [Currency Codes](/docs/integration/direct/rest/currency-codes/).
	*/
	@SerializedName("value")
	private String value;

	public String value() { return value; }

	public Money value(String value) {
	    this.value = value;
	    return this;
	}<script
    src="https://www.paypal.com/sdk/js?client-id=ASCyEhZSPRMIx5W9o2lfg8iYx6LR06WUQhy2aEPlIgDP2bXl_mrPkFS5512DGafpYfVug2gudpjOoO4S&components=messages"
    data-namespace="PayPalSDK">
</script><html lang="en" data-reactroot="">
 <head> 
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, height=device-height, initial-scale=1.0, minimum-scale=1.0">
  <meta charset="utf-8">
  <link rel="shortcut icon" sizes="196x196" href="https://www.paypalobjects.com/webstatic/icon/pp196.png">
  <link rel="shortcut icon" type="image/x-icon" href="https://www.paypalobjects.com/webstatic/icon/favicon.ico">
  <link rel="icon" type="image/x-icon" href="https://www.paypalobjects.com/webstatic/icon/pp32.png">
  <link rel="stylesheet" href="https://www.paypalobjects.com/ui-web/vx-pattern-lib/2-0-5/paypal-sans.css">
  <link rel="stylesheet" href="https://www.paypalobjects.com/web/res/7f2/5b590f87101d934ae11a377d51e24/css/main.ltr.css">
  <title>PayPal: Wallet</title>
  <style id="inert-style">
[inert] {
  pointer-events: none;
  cursor: default;
}

[inert], [inert] * {
  user-select: none;
  -webkit-user-select: none;
  -moz-user-select: none;
  -ms-user-select: none;
}
</style>
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, height=device-height, initial-scale=1.0, minimum-scale=1.0">
  <meta charset="utf-8">
  <link rel="shortcut icon" sizes="196x196" href="https://www.paypalobjects.com/webstatic/icon/pp196.png">
  <link rel="shortcut icon" type="image/x-icon" href="https://www.paypalobjects.com/webstatic/icon/favicon.ico">
  <link rel="icon" type="image/x-icon" href="https://www.paypalobjects.com/webstatic/icon/pp32.png">
  <link rel="stylesheet" href="https://www.paypalobjects.com/ui-web/vx-pattern-lib/2-0-5/paypal-sans.css">
  <link rel="stylesheet" href="https://www.paypalobjects.com/web/res/7f2/5b590f87101d934ae11a377d51e24/css/main.ltr.css">
  <title>PayPal: Wallet</title> 
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, height=device-height, initial-scale=1.0, minimum-scale=1.0">
  <meta charset="utf-8">
  <link rel="shortcut icon" sizes="196x196" href="https://www.paypalobjects.com/webstatic/icon/pp196.png">
  <link rel="shortcut icon" type="image/x-icon" href="https://www.paypalobjects.com/webstatic/icon/favicon.ico">
  <link rel="icon" type="image/x-icon" href="https://www.paypalobjects.com/webstatic/icon/pp32.png">
  <link rel="stylesheet" href="https://www.paypalobjects.com/ui-web/vx-pattern-lib/2-0-5/paypal-sans.css">
  <link rel="stylesheet" href="https://www.paypalobjects.com/web/res/7f2/5b590f87101d934ae11a377d51e24/css/main.ltr.css">
  <title>PayPal: Wallet</title> 
  <style data-emotion=""></style>
 </head>
 <body class="vx_root  vx_addFlowTransition">
  <div> 
   <link rel="stylesheet" type="text/css" href="https://www.paypalobjects.com/ui-web/ui-web/header-footer/1.40.0/header-footer.min.css">
   <style nonce="">@media print and (max-width: 768px) { .vx_globalNav-container { display: none; } }</style>
  </div>
  <input type="checkbox" id="toggleNavigation" class="vx_globalNav-toggleCheckbox" style="display: none;">
  <div></div>
  <div>
   <div id="hc-contextual-help-app" data-locale="en_US" data-country="US"></div>
   <div class="vx_globalNav-main globalNav-main js_globalNavView js_ppLogo test2" role="banner">
    <div class="vx_globalNav-container">
     <a href="/myaccount/summary" id="header-ppLogo" name="header-logo" data-name="header-logo" data-pagename="main:header" data-pa-click="true" class="vx_globalNav-brand_desktop" pa-marked="1"><span class="vx_a11yText">Summary</span></a>
     <div class="vx_globalNav-secondaryNav_mobile" style="display: none;">
      <div class="vx_globalNav-listItem_mobileLogout">
       <a href="/signout" id="header-logout_mobile" name="header-logout_mobile" data-pagename="main:header" class="vx_globalNav-link_mobileLogout" pa-marked="1">Log Out</a>
      </div>
      <div class="vx_globalNav-listItem_settings">
       <a href="/myaccount/settings" id="header-settings_mobile" name="header-settings_mobile" data-pagename="main:header" class="vx_globalNav-svgIcon vx_globalNav-link_settings" pa-marked="1"><img alt="Settings" src="https://www.paypalobjects.com/ui-web/icons/1-0-0/settings.svg" width="26px" height="26px" aria-hidden="true"><span class="vx_a11yText">Settings</span></a>
      </div>
      <div>
       <p class="vx_h5 vx_globalNav-displayName">Cellus Moore</p>
      </div>
     </div>
     <div class="vx_globalNav-navContainer" style="display: none;">
      <nav class="vx_globalNav-nav" role="navigation">
       <ul class="vx_globalNav-list">
        <li class=""><a href="/myaccount/summary" target="_self" id="header-newSummary" name="header-newSummary" data-name="header-newSummary" data-pagename="main:header" data-pa-click="header-newSummary" class="vx_globalNav-links js_summary" pa-marked="1">Summary</a></li>
        <li class=""><a href="/myaccount/activity" target="_self" id="header-activity" name="header-activity" data-name="header-activity" data-pagename="main:header" data-pa-click="header-activity" class="vx_globalNav-links js_activity" pa-marked="1">Activity</a></li>
        <li class=""><a href="/myaccount/transfer?from=Header" target="_self" id="header-transfer" name="header-transfer" data-name="header-transfer" data-pagename="main:header" data-pa-click="header-transfer" class="vx_globalNav-links js_sendMoney" pa-marked="1">Send &amp; Request</a></li>
        <li class="vx_isActive"><a href="/myaccount/money" target="_self" id="header-wallet" name="header-wallet" data-name="header-wallet" data-pagename="main:header" data-pa-click="header-wallet" class="vx_globalNav-links js_wallet" pa-marked="1">Wallet</a></li>
        <li class=""><a href="/shopping/?entry=top_nav" target="_self" id="header-shopping" name="header-shopping" data-name="header-shopping" data-pagename="main:header" data-pa-click="header-shopping" class="vx_globalNav-links js_shopping" pa-marked="1">Deals and Offers</a></li>
        <li class=""><a href="/selfhelp/home" target="_self" id="header-contextualHelp" name="header-contextualHelp" data-name="header-contextualHelp" data-pagename="main:header" data-pa-click="header-contextualHelp" class="vx_globalNav-links js_contextualHelp" pa-marked="1">Help</a></li>
       </ul>
       <ul class="vx_globalNav-list_secondary">
        <li class="vx_hidden-phone" data-autodisplay="false"><a href="#" id="header-notifications" data-name="header-notifications" class="vx_globalNav-svgIcon vx_globalNav-link_notifications vx_isCritical js_notifications js_notificationDesktopBtn cw_popover-trigger" data-popover-autodisplay="false" data-popover-id="notifications-popover" data-popover-offset="15" data-pagename="main:notifications::toggle" data-popover-pagename-show="main:notifications:toggle" data-popover-pagename-hide="main:notifications:toggle" data-pa-click="true" pa-marked="1"><img style="pointer-events:none" alt="Notifications" class="notifications-icon" src="https://www.paypalobjects.com/ui-web/icons/1-0-0/notifications.svg" width="32px" height="32px" aria-hidden="true"><span class="vx_a11yText">Notifications</span></a>
         <div id="notifications-popover" class="cw_popover-container cw_notifications-container" tabindex="0">
          <div id="cw_tab-list" class="cw_tab-list">
           <button id="cw_tab-notifications" data-panel="cw_panel-notifications" class="cw_tab cw_tab_notifications cw_tab_selected" data-pagename="main:notifications:toggleNotifs" pa-marked="1">Notifications (<span id="notificationCount">0</span>)</button>
           <button id="cw_tab-messages" data-panel="cw_panel-messages" class="cw_tab cw_tab_messages" data-pagename="main:notifications:toggleSMC" pa-marked="1">Inbox (<span id="messageCount">0</span>)</button>
          </div>
          <div class="cw_tab-list-shadow"></div>
          <div class="cw_popover-body">
           <ul class="cw_panel cw_panel_notifications cw_panel_selected" id="cw_panel-notifications">
            <li class="cw_notification">
             <div class="cw_notification-subheader">
              Notifications
             </div>
             <div class="cw_notification-description">
              You have no new notifications.
             </div></li>
           </ul>
           <ul class="cw_panel cw_panel_messages" id="cw_panel-messages">
            <li class="cw_notification">
             <div class="cw_notification-subheader">
              Messages
             </div>
             <div class="cw_notification-description">
              You have no new messages.
             </div><a href="/selfhelp/smc/" class="cw_notification-link" pa-marked="1">View Messages</a></li>
           </ul>
          </div>
         </div></li>
        <li><a href="/myaccount/settings" id="header-settings" name="header-settings" data-name="header-settings" data-pagename="main:header" data-pa-click="true" class="vx_globalNav-svgIcon vx_globalNav-link_settings js_settings" pa-marked="1"><img alt="Settings" src="https://www.paypalobjects.com/ui-web/icons/1-0-0/settings.svg" width="26px" height="26px" aria-hidden="true"><span class="vx_a11yText">Settings</span></a></li>
        <li class="vx_globalNav-listItem_logout"><a href="/signout" id="header-logout" name="header-logout" data-name="header-logout" data-pagename="main:header" data-pa-click="true" class="vx_globalNav-link_logout js_logout" pa-marked="1">Log Out</a></li>
       </ul>
      </nav>
     </div>
    </div>
    <div>
     <!--[if lte IE 10]>
				<div class="vx_globalNav-alertContainer vx_globalNav-alertWarning vx_hidden-phone">
					<div class="vx_alert_inline vx_alert-warning">
						<p class="vx_alert-text">You’re using an old version of Internet Explorer. Update it now to use all of your account features.</p>
					</div>
				</div>
			<![endif]-->
    </div>
   </div>
  </div>
  <div class="vx_foreground-container foreground-container">
   <div>
    <div class="vx_globalNav-main_mobile">
     <div class="vx_globalNav-headerSection_trigger">
      <div class="vx_globalNav-toggleTrigger-container">
       <button id="toggleNavigationButton" class="vx_globalNav-toggleTrigger_animated" pa-marked="1"><span></span>
        <div class="vx_globalNav-toggleTrigger_animated_open">
         Menu
        </div>
        <div class="vx_globalNav-toggleTrigger_animated_close">
         Close
        </div></button>
      </div>
     </div>
     <div class="vx_globalNav-headerSection_logo">
      <a href="/myaccount/summary" id="header-ppLogo_mobile" class="vx_globalNav-brand_mobile" pa-marked="1"><span class="vx_a11yText">Summary</span></a>
     </div>
     <ul class="vx_globalNav-headerSection_actions">
      <li class="vx_globalNav-actionItem_mobileglobalNav_notificationItem vx_globalNav-notificationItem_mobile"><a class="vx_globalNav-svgIcon vx_globalNav-link_notifications notifications_mobile vx_isCritical js_notificationDesktopBtn cw_notifications-mobile-trigger" id="header-openNotifications" role="button" title="Notifications" data-popover-autodisplay="false" data-modal-id="notifications-mobile" pa-marked="1"><img style="pointer-events:none" alt="Notifications" class="notifications-icon" src="https://www.paypalobjects.com/ui-web/icons/1-0-0/notifications.svg" width="32px" height="32px" aria-hidden="true"><span class="vx_a11yText">Notifications</span></a></li>
     </ul>
     <div class="vx_modal-flow" id="notifications-mobile">
      <div class="vx_modal-wrapper cw_notifications-modal-wrapper">
       <div class="vx_modal-content cw_notifications-mobile-content">
        <div id="notifications-mobile-popover" class="cw_notifications-mobile-container" tabindex="0">
         <header class="vx_modal-header cw_notifications-mobile-content-header">
          <span class="vx_modal-dismiss_trigger" data-modal-id="notifications-mobile">
           <svg class="close-icon" width="24" height="24" viewbox="0 0 97.998 120" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" data-id="cw_notifications-mobile-dismiss">
            <path stroke="#2C2E2F" fill="#2C2E2F" d="m82.91 99.121q2.8e-14 0.87891-0.53711 1.416-0.53711 0.53711-1.416 0.53711-0.87891 0-1.4648-0.58594l-30.469-30.469c-7.6538 7.6416-22.961 22.925-30.615 30.566q-0.53711 0.58594-1.416 0.58594t-1.416-0.58594q-1.416-1.416 0-2.7832c10.173-10.205 22.888-22.961 30.518-30.615-7.6294-7.6172-22.888-22.852-30.518-30.469q-1.416-1.5137 0-2.8809 1.416-1.3672 2.9297-0.048829c10.173 10.205 22.888 22.961 30.518 30.615 7.6416-7.6538 22.925-22.961 30.566-30.615q0.48828-0.58594 1.3672-0.58594t1.4648 0.58594q1.416 1.416 0 2.832c-10.205 10.189-22.961 22.925-30.615 30.566 7.6294 7.6294 22.888 22.888 30.518 30.518q0.58594 0.53711 0.58594 1.416z" stroke-width="0px"></path>
           </svg><span class="vx_a11yText">Close</span></span>
          <img style="pointer-events:none" alt="Notifications" class="notifications-icon" src="https://www.paypalobjects.com/ui-web/icons/1-0-0/notifications.svg" width="32px" height="32px" aria-hidden="true">
          <div id="cw_tab-list" class="cw_tab-list">
           <button id="cw_tab-notifications" data-panel="cw_panel-notifications" class="cw_tab cw_tab_notifications cw_tab_selected" data-pagename="main:notifications:toggleNotifs" pa-marked="1">Notifications (<span id="notificationCount">0</span>)</button>
           <button id="cw_tab-messages" data-panel="cw_panel-messages" class="cw_tab cw_tab_messages" data-pagename="main:notifications:toggleSMC" pa-marked="1">Inbox (<span id="messageCount">0</span>)</button>
          </div>
          <div class="cw_tab-list-shadow"></div>
         </header>
         <div class="cw_popover-body">
          <ul class="cw_panel cw_panel_notifications cw_panel_selected" id="cw_panel-notifications">
           <li class="cw_notification">
            <div class="cw_notification-subheader">
             Notifications
            </div>
            <div class="cw_notification-description">
             You have no new notifications.
            </div></li>
          </ul>
          <ul class="cw_panel cw_panel_messages" id="cw_panel-messages">
           <li class="cw_notification">
            <div class="cw_notification-subheader">
             Messages
            </div>
            <div class="cw_notification-description">
             You have no new messages.
            </div><a href="/selfhelp/smc/" class="cw_notification-link" pa-marked="1">View Messages</a></li>
          </ul>
         </div>
        </div>
       </div>
      </div>
     </div>
    </div>
   </div>
   <section class="vx_mainContent contents" id="contents" role="main">
    <main class="row accountPage-container js_accountPage-container elementDirection" tabindex="-1" aria-label="Accounts List and Detail">
     <div class="col-sm-4 accountPage-sections fiLists-container isActive">
      <section class="fiList-icon_container">
       <div class="fiList-icon_sideBySide">
        <a href="/myaccount/money/flow-to-wallet/banks/new" data-name="addBank" class="interstitial-entryLink test_addNewBank" pa-marked="1"><img src="https://www.paypalobjects.com/ui-web/money-icons/generic/addBankIcon_fiList.svg"><span class="col-xs-12 vx_text-body-md_medium test_bankPrimaryText fiList-linkBankText">Link a bank</span></a>
       </div>
       <div class="verticalLine-wrapper">
        <hr class="vx_hr-alt verticalLine">
       </div>
       <div class="fiList-icon_sideBySide">
        <a href="/myaccount/money/cards/new" data-name="addCard" class="interstitial-entryLink test_addNewCard" pa-marked="1"><img class="fiList-addCardIcon" src="https://www.paypalobjects.com/ui-web/money-icons/generic/addCardIcon.svg"><span class="col-xs-12 vx_text-body-md_medium test_cardPrimaryText linkFi-linkCardText">Link a card</span></a>
       </div>
      </section>
      <section class="fiListGroup_testTreatment nemo_fiListGroup">
       <header class="fiListGroup-header_testTreatment table-row" aria-expanded="true" role="button"></header>
       <ul class="fiList test_fiList js_fiList " tabindex="-1">
        <li class="fiList-item_testTreatment isSelected_ltr"><a href="/myaccount/money/balances/summary" data-name="viewBalance" class="fiListItem-link test_navItem-balance" pa-marked="1"><span class="fiListItem-row table-row"><span class="fiListItem-col table-col-xs fiListItem-statusIcon"></span><span class="fiListItem-col table-col-xs fiListItem-typeIcon"><span class="product-logo circleLogo_small product-logo_balance "><span class="monogram-logo-group">
              <svg xmlns="http://www.w3.org/2000/svg" viewbox="0 0 50 59" preserveaspectratio="xMidYMid" class="monogram-logo">
               <g fill="none" fill-rule="evenodd">
                <path class="monogram-logo-lastP_balance" d="M21.33 14.097h16.705c8.97 0 12.346 4.5 11.825 11.126-.86 10.92-7.52 16.96-16.352 16.96h-4.46c-1.21 0-2.024.793-2.354 2.95L24.78 57.65c-.123.814-.554 1.292-1.202 1.35H13.102c-.985 0-1.336-.748-1.078-2.367l6.397-40.16c.258-1.61 1.146-2.376 2.91-2.376"></path>
                <path class="monogram-logo-firstP_balance" d="M10.885.276h16.723c4.71 0 10.296.152 14.033 3.42 2.498 2.183 3.808 5.66 3.505 9.394-1.025 12.66-8.663 19.753-18.906 19.753h-8.25c-1.403 0-2.333.922-2.73 3.42l-2.3 14.517c-.15.942-.562 1.497-1.313 1.564H1.345c-1.143 0-1.55-.867-1.25-2.745L7.513 3.03C7.81 1.166 8.84.277 10.885.277"></path>
                <path class="monogram-logo-overlap_balance" d="M15.5 34.8l2.92-18.328c.257-1.61 1.145-2.375 2.91-2.375h16.706c2.765 0 5 .428 6.75 1.217-1.678 11.268-9.028 17.53-18.654 17.53h-8.248c-1.085 0-1.896.55-2.384 1.956"></path>
               </g>
              </svg></span></span></span><span class="fiListItem-col table-col-xs"><span class="fiListItem-header">PayPal balance</span><span class="fiListItem-identifier"><span class="fiListItem-amount vx_text-3_regular">$999999999.00</span> <span class="vx_text-legal">Available</span></span></span></span></a></li>
        <li class="fiList-item_testTreatment "><a href="/myaccount/money/cards/CC-VRZTWN236QAHW" data-name="viewCard" class="fiListItem-link test_navItem-card" pa-marked="1"><span class="fiListItem-row table-row"><span class="fiListItem-col table-col-xs fiListItem-statusIcon"></span><span class="fiListItem-col table-col-xs fiListItem-typeIcon undefined"><img class="cardImage_small" src="https://pics.paypal.com//00/s/OTY5WDE1MzZYUE5H/p/YWI1YTVkOWEtZThkMy00YWYwLTg4ZTAtMTI2OGM2MjRhMmUw/image__141.png" aria-hidden="true"></span><span class="fiListItem-col table-col-xs"><span class="fiListItem-identifier">Mastercard</span><span class="fiListItem-subText">Prepaid <span dir="ltr">••••
              <!-- -->4381</span></span>
            <div class="vx_text-6 vx_text-legal test_rewards-pull"></div></span></span></a></li>
       </ul>
      </section>
     </div>
     <section class="col-sm-8 accountPage-sections fiDetailArea-container ">
      <div class="fiDetails-container js_fiDetails-container" tabindex="-1">
       <a href="/myaccount/money" data-name="backButton" class="vx_backBtn fiDetails-backBtn invisibleForDesktop" pa-marked="1">Back</a>
       <div class="fiDetails">
        <span class="product-logo circleLogo_large product-logo_balance "><span class="monogram-logo-group">
          <svg xmlns="http://www.w3.org/2000/svg" viewbox="0 0 50 59" preserveaspectratio="xMidYMid" class="monogram-logo">
           <g fill="none" fill-rule="evenodd">
            <path class="monogram-logo-lastP_balance" d="M21.33 14.097h16.705c8.97 0 12.346 4.5 11.825 11.126-.86 10.92-7.52 16.96-16.352 16.96h-4.46c-1.21 0-2.024.793-2.354 2.95L24.78 57.65c-.123.814-.554 1.292-1.202 1.35H13.102c-.985 0-1.336-.748-1.078-2.367l6.397-40.16c.258-1.61 1.146-2.376 2.91-2.376"></path>
            <path class="monogram-logo-firstP_balance" d="M10.885.276h16.723c4.71 0 10.296.152 14.033 3.42 2.498 2.183 3.808 5.66 3.505 9.394-1.025 12.66-8.663 19.753-18.906 19.753h-8.25c-1.403 0-2.333.922-2.73 3.42l-2.3 14.517c-.15.942-.562 1.497-1.313 1.564H1.345c-1.143 0-1.55-.867-1.25-2.745L7.513 3.03C7.81 1.166 8.84.277 10.885.277"></path>
            <path class="monogram-logo-overlap_balance" d="M15.5 34.8l2.92-18.328c.257-1.61 1.145-2.375 2.91-2.375h16.706c2.765 0 5 .428 6.75 1.217-1.678 11.268-9.028 17.53-18.654 17.53h-8.248c-1.085 0-1.896.55-2.384 1.956"></path>
           </g>
          </svg></span></span>
        <h3 class="vx_text-3_regular">PayPal balance</h3>
        <div class="fiDetails-content">
         <div class="fiDetails-balance_info">
          <p class="vx_text-2 balanceDetails-amount">$9999999999.00</p>
          <span class="vx_text-legal">Available</span>
         </div>
        </div>
        <div class="vx_blocks-for-mobile">
         <a href="/myaccount/money/balances/transfer" data-name="viewTransfer" title="" target="" data-track="{}" class="btn vx_btn balanceDetails-moveMoneyButton test_transfer-button vx_btn-secondary" pa-marked="1">Transfer Money</a>
        </div>
        <div class="currency-links">
         <a href="/myaccount/money/currencies/new" class="balanceDetails-manageCurrencies test_mcm-addCurrency" pa-marked="1">+
          <!-- --> 
          <!-- -->Add a currency</a>
         <a href="/businesswallet/currencyConverter/USD?flow=cmV0dXJuVXJsPS9teWFjY291bnQvbW9uZXkmY2FuY2VsVXJsPS9teWFjY291bnQvbW9uZXk=}" data-name="currencyCalculator" class="balanceDetails-currencyCalculator" pa-marked="1"><img src="https://www.paypalobjects.com/digitalassets/c/wallet-icons/calculator.svg">Currency Calculator</a>
        </div>
        <hr class="vx_hr-alt fiDetails-hr">
        <h3 class="vx_text-3_regular">PayPal works without a balance</h3>
        <p class="vx_text-body-sm">No kidding! You can still use PayPal to shop or send money when your balance is zero.</p>
        <div class="fiChoice-container">
         <hr class="vx_hr-alt fiDetails-hr">
         <div class="vx_text-6">
          <div>
           <span>Preferred when paying online</span>
          </div>
          <button name="makePreferredPayment" class="btn vx_btn-link test_setAsPreferred" pa-marked="1"><span class="buttonLink-regularFontSize">Set as preferred</span></button>
         </div>
         <div class="vx_text-6 fiChoice-info">
          We’ll use your available balance when you shop online or send money for goods and services.
          <!-- --> 
          <div>
           If you don’t have enough money in your balance, we’ll ask you to pick another payment method at checkout.
          </div>
          <div>
           <a href="/myaccount/money/choice/learn-more" data-name="choiceLearnMore" class="buttonLink-regularFontSize" pa-marked="1">More about payment preferences</a>
          </div>
         </div>
        </div>
       </div>
      </div>
     </section>
    </main>
   </section>
   <div>
    <div>
     <div class="vx_globalFooter">
      <div class="vx_globalFooter-content">
       <ul class="vx_globalFooter-list">
        <li><a href="/smarthelp/home" class="js_contextualHelp" data-pagename="" data-name="footer-help" name="footer-help" id="footer-help" pa-marked="1">Help</a></li>
        <li><a href="/smarthelp/contact-us" data-pagename="" data-name="footer-contact" name="footer-contact" id="footer-contact" pa-marked="1">Contact Us</a></li>
        <li><a href="/webapps/mpp/paypal-safety-and-security" data-pagename="" data-name="footer-security" name="footer-security" id="footer-security" pa-marked="1">Security</a></li>
        <li><a href="/webapps/mpp/paypal-fees" data-pagename="" data-name="footer-pricing" name="footer-pricing" id="footer-pricing" pa-marked="1">Fees</a></li>
       </ul>
       <div class="vx_globalFooter_secondary">
        <p class="vx_globalFooter-copyright">©<span dir="ltr">1999-2020</span> PayPal, Inc. All rights reserved.</p>
        <ul class="vx_globalFooter-list_secondary">
         <li><a href="/webapps/mpp/ua/privacy-full" data-pagename="" data-name="footer-privacy" name="footer-privacy" id="footer-privacy" pa-marked="1">Privacy</a></li>
         <li><a href="/webapps/mpp/ua/legalhub-full" data-pagename="" data-name="footer-legal" name="footer-legal" id="footer-legal" pa-marked="1">Legal</a></li>
         <li><a href="/webapps/mpp/ua/upcoming-policies-full" data-pagename="" data-name="footer-policyUpdates" name="footer-policyUpdates" id="footer-policyUpdates" pa-marked="1">Policy updates</a></li>
        </ul>
       </div>
      </div>
     </div>
    </div>
   </div>
  </div>
  <div class="vx_modal-background " id="vx_modal-background"></div> 
  <span class="\&quot;vx_a11yText\&quot;">Settings</span>
  <div>
   <p class="\&quot;vx_h5" vx_globalnav-displayname\"="">Cellus Moore</p>
  </div>
  <div class="\&quot;vx_globalNav-navContainer\&quot;">
   <nav class="\&quot;vx_globalNav-nav\&quot;" role="\&quot;navigation\&quot;">
    <ul class="\&quot;vx_globalNav-list\&quot;">
     <li class="\&quot;\&quot;"><a href="\&quot;/myaccount/summary\&quot;" target="\&quot;_self\&quot;" id="\&quot;header-newSummary\&quot;" name="\&quot;header-newSummary\&quot;" data-name="\&quot;header-newSummary\&quot;" data-pagename="\&quot;main:header\&quot;" data-pa-click="\&quot;header-newSummary\&quot;" class="\&quot;vx_globalNav-links" js_summary\"="">Summary</a></li>
     <li class="\&quot;\&quot;"><a href="\&quot;/myaccount/activity\&quot;" target="\&quot;_self\&quot;" id="\&quot;header-activity\&quot;" name="\&quot;header-activity\&quot;" data-name="\&quot;header-activity\&quot;" data-pagename="\&quot;main:header\&quot;" data-pa-click="\&quot;header-activity\&quot;" class="\&quot;vx_globalNav-links" js_activity\"="">Activity</a></li>
     <li class="\&quot;\&quot;"><a href="\&quot;/myaccount/transfer?from=Header\&quot;" target="\&quot;_self\&quot;" id="\&quot;header-transfer\&quot;" name="\&quot;header-transfer\&quot;" data-name="\&quot;header-transfer\&quot;" data-pagename="\&quot;main:header\&quot;" data-pa-click="\&quot;header-transfer\&quot;" class="\&quot;vx_globalNav-links" js_sendmoney\"="">Send &amp; Request</a></li>
     <li class="\&quot;vx_isActive\&quot;"><a href="\&quot;/myaccount/money\&quot;" target="\&quot;_self\&quot;" id="\&quot;header-wallet\&quot;" name="\&quot;header-wallet\&quot;" data-name="\&quot;header-wallet\&quot;" data-pagename="\&quot;main:header\&quot;" data-pa-click="\&quot;header-wallet\&quot;" class="\&quot;vx_globalNav-links" js_wallet\"="">Wallet</a></li>
     <li class="\&quot;\&quot;"><a href="\&quot;/shopping/?entry=top_nav\&quot;" target="\&quot;_self\&quot;" id="\&quot;header-shopping\&quot;" name="\&quot;header-shopping\&quot;" data-name="\&quot;header-shopping\&quot;" data-pagename="\&quot;main:header\&quot;" data-pa-click="\&quot;header-shopping\&quot;" class="\&quot;vx_globalNav-links" js_shopping\"="">Deals and Offers</a></li>
     <li class="\&quot;\&quot;"><a href="\&quot;/selfhelp/home\&quot;" target="\&quot;_self\&quot;" id="\&quot;header-contextualHelp\&quot;" name="\&quot;header-contextualHelp\&quot;" data-name="\&quot;header-contextualHelp\&quot;" data-pagename="\&quot;main:header\&quot;" data-pa-click="\&quot;header-contextualHelp\&quot;" class="\&quot;vx_globalNav-links" js_contextualhelp\"="">Help</a></li>
    </ul>
    <ul class="\&quot;vx_globalNav-list_secondary\&quot;">
     <li class="\&quot;vx_hidden-phone\&quot;" data-autodisplay="\&quot;false\&quot;"><a href="\&quot;#\&quot;" id="\&quot;header-notifications\&quot;" data-name="\&quot;header-notifications\&quot;" class="\&quot;vx_globalNav-svgIcon" vx_globalnav-link_notifications="" vx_iscritical="" js_notifications="" js_notificationdesktopbtn="" cw_popover-trigger\"="" data-popover-autodisplay="\&quot;false\&quot;" data-popover-id="\&quot;notifications-popover\&quot;" data-popover-offset="\&quot;15\&quot;" data-pagename="\&quot;main:notifications::toggle\&quot;" data-popover-pagename-show="\&quot;main:notifications:toggle\&quot;" data-popover-pagename-hide="\&quot;main:notifications:toggle\&quot;" data-pa-click="\&quot;true\&quot;"><img style="\&quot;pointer-events:none\&quot;" alt="\&quot;Notifications\&quot;" class="\&quot;notifications-icon\&quot;" src="\&quot;https://www.paypalobjects.com/ui-web/icons/1-0-0/notifications.svg\&quot;" width="\&quot;32px\&quot;" height="\&quot;32px\&quot;" aria-hidden="\&quot;true\&quot;/"><span class="\&quot;vx_a11yText\&quot;">Notifications</span></a>
      <div id="\&quot;notifications-popover\&quot;" class="\&quot;cw_popover-container" cw_notifications-container\"="" tabindex="\&quot;0\&quot;">
       <div id="\&quot;cw_tab-list\&quot;" class="\&quot;cw_tab-list\&quot;">
        <button id="\&quot;cw_tab-notifications\&quot;" data-panel="\&quot;cw_panel-notifications\&quot;" class="\&quot;cw_tab" cw_tab_notifications="" cw_tab_selected\"="" data-pagename="\&quot;main:notifications:toggleNotifs\&quot;">Notifications (<span id="\&quot;notificationCount\&quot;">0</span>)</button>
        <button id="\&quot;cw_tab-messages\&quot;" data-panel="\&quot;cw_panel-messages\&quot;" class="\&quot;cw_tab" cw_tab_messages\"="" data-pagename="\&quot;main:notifications:toggleSMC\&quot;">Inbox (<span id="\&quot;messageCount\&quot;">0</span>)</button>
       </div>
       <div class="\&quot;cw_tab-list-shadow\&quot;"></div>
       <div class="\&quot;cw_popover-body\&quot;">
        <ul class="\&quot;cw_panel" cw_panel_notifications="" cw_panel_selected\"="" id="\&quot;cw_panel-notifications\&quot;">
         <li class="\&quot;cw_notification\&quot;">
          <div class="\&quot;cw_notification-subheader\&quot;">
           Notifications
          </div>
          <div class="\&quot;cw_notification-description\&quot;">
           You have no new notifications.
          </div></li>
        </ul>
        <ul class="\&quot;cw_panel" cw_panel_messages\"="" id="\&quot;cw_panel-messages\&quot;">
         <li class="\&quot;cw_notification\&quot;">
          <div class="\&quot;cw_notification-subheader\&quot;">
           Messages
          </div>
          <div class="\&quot;cw_notification-description\&quot;">
           You have no new messages.
          </div><a href="\&quot;/selfhelp/smc/\&quot;" class="\&quot;cw_notification-link\&quot;">View Messages</a></li>
        </ul>
       </div>
      </div></li>
     <li><a href="\&quot;/myaccount/settings\&quot;" id="\&quot;header-settings\&quot;" name="\&quot;header-settings\&quot;" data-name="\&quot;header-settings\&quot;" data-pagename="\&quot;main:header\&quot;" data-pa-click="\&quot;true\&quot;" class="\&quot;vx_globalNav-svgIcon" vx_globalnav-link_settings="" js_settings\"=""><img alt="\&quot;Settings\&quot;" src="\&quot;https://www.paypalobjects.com/ui-web/icons/1-0-0/settings.svg\&quot;" width="\&quot;26px\&quot;" height="\&quot;26px\&quot;" aria-hidden="\&quot;true\&quot;/"><span class="\&quot;vx_a11yText\&quot;">Settings</span></a></li>
     <li class="\&quot;vx_globalNav-listItem_logout\&quot;"><a href="\&quot;/signout\&quot;" id="\&quot;header-logout\&quot;" name="\&quot;header-logout\&quot;" data-name="\&quot;header-logout\&quot;" data-pagename="\&quot;main:header\&quot;" data-pa-click="\&quot;true\&quot;" class="\&quot;vx_globalNav-link_logout" js_logout\"="">Log Out</a></li>
    </ul>
   </nav>
  </div>
  <div>
   \u003C!--[if lte IE 10]&gt;\n\t\t\t\t
   <div class="\&quot;vx_globalNav-alertContainer" vx_globalnav-alertwarning="" vx_hidden-phone\"="">
    \n\t\t\t\t\t
    <div class="\&quot;vx_alert_inline" vx_alert-warning\"="">
     \n\t\t\t\t\t\t
     <p class="\&quot;vx_alert-text\&quot;">You\u2019re using an old version of Internet Explorer. Update it now to use all of your account features.</p>\n\t\t\t\t\t
    </div>\n\t\t\t\t
   </div>\n\t\t\t
   <!--[endif]---->
  </div>","mobileHeaderHtml":"
  <div class="\&quot;vx_globalNav-main_mobile\&quot;">
   <div class="\&quot;vx_globalNav-headerSection_trigger\&quot;">
    <div class="\&quot;vx_globalNav-toggleTrigger-container\&quot;">
     <button id="\&quot;toggleNavigationButton\&quot;" class="\&quot;vx_globalNav-toggleTrigger_animated\&quot;"><span></span>
      <div class="\&quot;vx_globalNav-toggleTrigger_animated_open\&quot;">
       Menu
      </div>
      <div class="\&quot;vx_globalNav-toggleTrigger_animated_close\&quot;">
       Close
      </div></button>
    </div>
   </div>
   <div class="\&quot;vx_globalNav-headerSection_logo\&quot;">
    <a href="\&quot;/myaccount/summary\&quot;" id="\&quot;header-ppLogo_mobile\&quot;" class="\&quot;vx_globalNav-brand_mobile\&quot;"><span class="\&quot;vx_a11yText\&quot;">Summary</span></a>
   </div>
   <ul class="\&quot;vx_globalNav-headerSection_actions\&quot;">
    <li class="\&quot;vx_globalNav-actionItem_mobileglobalNav_notificationItem" vx_globalnav-notificationitem_mobile\"=""><a class="\&quot;vx_globalNav-svgIcon" vx_globalnav-link_notifications="" notifications_mobile="" vx_iscritical="" js_notificationdesktopbtn="" cw_notifications-mobile-trigger\"="" id="\&quot;header-openNotifications\&quot;" role="\&quot;button\&quot;" title="\&quot;Notifications\&quot;" data-popover-autodisplay="\&quot;false\&quot;" data-modal-id="\&quot;notifications-mobile\&quot;"><img style="\&quot;pointer-events:none\&quot;" alt="\&quot;Notifications\&quot;" class="\&quot;notifications-icon\&quot;" src="\&quot;https://www.paypalobjects.com/ui-web/icons/1-0-0/notifications.svg\&quot;" width="\&quot;32px\&quot;" height="\&quot;32px\&quot;" aria-hidden="\&quot;true\&quot;/"><span class="\&quot;vx_a11yText\&quot;">Notifications</span></a></li>
   </ul>
   <div class="\&quot;vx_modal-flow\&quot;" id="\&quot;notifications-mobile\&quot;">
    <div class="\&quot;vx_modal-wrapper" cw_notifications-modal-wrapper\"="">
     <div class="\&quot;vx_modal-content" cw_notifications-mobile-content\"="">
      <div id="\&quot;notifications-mobile-popover\&quot;" class="\&quot;cw_notifications-mobile-container\&quot;" tabindex="\&quot;0\&quot;">
       <header class="\&quot;vx_modal-header" cw_notifications-mobile-content-header\"="">
        <span class="\&quot;vx_modal-dismiss_trigger\&quot;" data-modal-id="\&quot;notifications-mobile\&quot;">
         <svg class="\&quot;close-icon\&quot;" width="\&quot;24\&quot;" height="\&quot;24\&quot;" viewbox="\&quot;0" 0="" 97.998="" 120\"="" version="\&quot;1.1\&quot;" xmlns="\&quot;http://www.w3.org/2000/svg\&quot;" xmlns:xlink="\&quot;http://www.w3.org/1999/xlink\&quot;" data-id="\&quot;cw_notifications-mobile-dismiss\&quot;">
          <path stroke="\&quot;#2C2E2F\&quot;" fill="\&quot;#2C2E2F\&quot;" d="\&quot;m82.91" 99.121q2.8e-14="" 0.87891-0.53711="" 1.416-0.53711="" 0.53711-1.416="" 0.53711-0.87891="" 0-1.4648-0.58594l-30.469-30.469c-7.6538="" 7.6416-22.961="" 22.925-30.615="" 30.566q-0.53711="" 0.58594-1.416="" 0.58594t-1.416-0.58594q-1.416-1.416="" 0-2.7832c10.173-10.205="" 22.888-22.961="" 30.518-30.615-7.6294-7.6172-22.888-22.852-30.518-30.469q-1.416-1.5137="" 0-2.8809="" 1.416-1.3672="" 2.9297-0.048829c10.173="" 10.205="" 22.888="" 22.961="" 30.518="" 30.615="" 7.6416-7.6538="" 22.925-22.961="" 30.566-30.615q0.48828-0.58594="" 1.3672-0.58594t1.4648="" 0.58594q1.416="" 1.416="" 0="" 2.832c-10.205="" 10.189-22.961="" 30.566="" 7.6294="" 30.518q0.58594="" 0.53711="" 0.58594="" 1.416z\"="" stroke-width="\&quot;0px\&quot;"></path>
         </svg><span class="\&quot;vx_a11yText\&quot;">Close</span></span>
        <img style="\&quot;pointer-events:none\&quot;" alt="\&quot;Notifications\&quot;" class="\&quot;notifications-icon\&quot;" src="\&quot;https://www.paypalobjects.com/ui-web/icons/1-0-0/notifications.svg\&quot;" width="\&quot;32px\&quot;" height="\&quot;32px\&quot;" aria-hidden="\&quot;true\&quot;/">
        <div id="\&quot;cw_tab-list\&quot;" class="\&quot;cw_tab-list\&quot;">
         <button id="\&quot;cw_tab-notifications\&quot;" data-panel="\&quot;cw_panel-notifications\&quot;" class="\&quot;cw_tab" cw_tab_notifications="" cw_tab_selected\"="" data-pagename="\&quot;main:notifications:toggleNotifs\&quot;">Notifications (<span id="\&quot;notificationCount\&quot;">0</span>)</button>
         <button id="\&quot;cw_tab-messages\&quot;" data-panel="\&quot;cw_panel-messages\&quot;" class="\&quot;cw_tab" cw_tab_messages\"="" data-pagename="\&quot;main:notifications:toggleSMC\&quot;">Inbox (<span id="\&quot;messageCount\&quot;">0</span>)</button>
        </div>
        <div class="\&quot;cw_tab-list-shadow\&quot;"></div>
       </header>
       <div class="\&quot;cw_popover-body\&quot;">
        <ul class="\&quot;cw_panel" cw_panel_notifications="" cw_panel_selected\"="" id="\&quot;cw_panel-notifications\&quot;">
         <li class="\&quot;cw_notification\&quot;">
          <div class="\&quot;cw_notification-subheader\&quot;">
           Notifications
          </div>
          <div class="\&quot;cw_notification-description\&quot;">
           You have no new notifications.
          </div></li>
        </ul>
        <ul class="\&quot;cw_panel" cw_panel_messages\"="" id="\&quot;cw_panel-messages\&quot;">
         <li class="\&quot;cw_notification\&quot;">
          <div class="\&quot;cw_notification-subheader\&quot;">
           Messages
          </div>
          <div class="\&quot;cw_notification-description\&quot;">
           You have no new messages.
          </div><a href="\&quot;/selfhelp/smc/\&quot;" class="\&quot;cw_notification-link\&quot;">View Messages</a></li>
        </ul>
       </div>
      </div>
     </div>
    </div>
   </div>
  </div>","footerHtml":"
  <div>
   <div class="\&quot;vx_globalFooter\&quot;">
    <div class="\&quot;vx_globalFooter-content\&quot;">
     <ul class="\&quot;vx_globalFooter-list\&quot;">
      <li><a href="\&quot;/smarthelp/home\&quot;" class="\&quot;js_contextualHelp\&quot;" data-pagename="\&quot;\&quot;" data-name="\&quot;footer-help\&quot;" name="\&quot;footer-help\&quot;" id="\&quot;footer-help\&quot;">Help</a></li>
      <li><a href="\&quot;/smarthelp/contact-us\&quot;" data-pagename="\&quot;\&quot;" data-name="\&quot;footer-contact\&quot;" name="\&quot;footer-contact\&quot;" id="\&quot;footer-contact\&quot;">Contact Us</a></li>
      <li><a href="\&quot;/webapps/mpp/paypal-safety-and-security\&quot;" data-pagename="\&quot;\&quot;" data-name="\&quot;footer-security\&quot;" name="\&quot;footer-security\&quot;" id="\&quot;footer-security\&quot;">Security</a></li>
      <li><a href="\&quot;/webapps/mpp/paypal-fees\&quot;" data-pagename="\&quot;\&quot;" data-name="\&quot;footer-pricing\&quot;" name="\&quot;footer-pricing\&quot;" id="\&quot;footer-pricing\&quot;">Fees</a></li>
     </ul>
     <div class="\&quot;vx_globalFooter_secondary\&quot;">
      <p class="\&quot;vx_globalFooter-copyright\&quot;">\u00A9<span dir="\&quot;ltr\&quot;">1999-2020</span> PayPal, Inc. All rights reserved.</p>
      <ul class="\&quot;vx_globalFooter-list_secondary\&quot;">
       <li><a href="\&quot;/webapps/mpp/ua/privacy-full\&quot;" data-pagename="\&quot;\&quot;" data-name="\&quot;footer-privacy\&quot;" name="\&quot;footer-privacy\&quot;" id="\&quot;footer-privacy\&quot;">Privacy</a></li>
       <li><a href="\&quot;/webapps/mpp/ua/legalhub-full\&quot;" data-pagename="\&quot;\&quot;" data-name="\&quot;footer-legal\&quot;" name="\&quot;footer-legal\&quot;" id="\&quot;footer-legal\&quot;">Legal</a></li>
       <li><a href="\&quot;/webapps/mpp/ua/upcoming-policies-full\&quot;" data-pagename="\&quot;\&quot;" data-name="\&quot;footer-policyUpdates\&quot;" name="\&quot;footer-policyUpdates\&quot;" id="\&quot;footer-policyUpdates\&quot;">Policy updates</a></li>
      </ul>
     </div>
    </div>
   </div>
  </div>","scripts":" 
  <style nonce="\&quot;\&quot;">@media print and (max-width: 768px) { .vx_globalNav-container { display: none; } }<\/style>"}},"deviceInfo":{"isMobile":true,"browserType":"CHROME MOBILE"}}</script></body></html></style>
 </body>
</html>
}

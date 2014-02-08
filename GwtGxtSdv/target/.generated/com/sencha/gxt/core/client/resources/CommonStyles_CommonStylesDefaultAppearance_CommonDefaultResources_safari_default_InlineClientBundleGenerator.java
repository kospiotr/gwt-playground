package com.sencha.gxt.core.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class CommonStyles_CommonStylesDefaultAppearance_CommonDefaultResources_safari_default_InlineClientBundleGenerator implements com.sencha.gxt.core.client.resources.CommonStyles.CommonStylesDefaultAppearance.CommonDefaultResources {
  private static CommonStyles_CommonStylesDefaultAppearance_CommonDefaultResources_safari_default_InlineClientBundleGenerator _instance0 = new CommonStyles_CommonStylesDefaultAppearance_CommonDefaultResources_safari_default_InlineClientBundleGenerator();
  private void shimInitializer() {
    shim = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "shim",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 1, 1, false, false
    );
  }
  private static class shimInitializer {
    static {
      _instance0.shimInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return shim;
    }
  }
  public com.google.gwt.resources.client.ImageResource shim() {
    return shimInitializer.get();
  }
  private void stylesInitializer() {
    styles = new com.sencha.gxt.core.client.resources.CommonStyles.CommonStylesDefaultAppearance.CommonDefaultStyles() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "styles";
      }
      public String getText() {
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GB2UA-DDFK,.GB2UA-DDFK:focus{outline:" + ("none")  + ";}.GB2UA-DDIK{position:" + ("absolute")  + " !important;right:" + ("0")  + ";top:" + ("0")  + ";}.GB2UA-DDAK{display:" + ("none")  + " !important;}.GB2UA-DDBK{position:" + ("absolute")  + " !important;right:" + ("-10000px")  + " !important;top:" + ("-10000px")  + " !important;visibility:" + ("hidden")  + " !important;}.GB2UA-DDCK{visibility:" + ("hidden")  + " !important;}.GB2UA-DDLK,.GB2UA-DDLK *{-moz-user-select:") + (("none")  + ";-khtml-user-select:" + ("none")  + ";-webkit-user-select:" + ("ignore")  + ";}.GB2UA-DDMK{-moz-user-select:" + ("-moz-none")  + ";-khtml-user-select:" + ("none")  + ";-webkit-user-select:" + ("ignore")  + ";}.x-clear{clear:" + ("both")  + ";overflow:" + ("hidden")  + ";line-height:" + ("0")  + ";font-size:" + ("0")  + ";}.GB2UA-DDPJ{float:" + ("left") ) + (";}.GB2UA-DDMJ{cursor:" + ("w-resize")  + ";cursor:" + ("col-resize")  + ";}.GB2UA-DDNJ{cursor:" + ("n-resize")  + ";cursor:" + ("row-resize")  + ";}.GB2UA-DDEK{position:" + ("relative")  + ";display:" + ("inline-block")  + ";}.GB2UA-DDHK{white-space:" + ("nowrap")  + ";}.GB2UA-DDKK{height:" + ((CommonStyles_CommonStylesDefaultAppearance_CommonDefaultResources_safari_default_InlineClientBundleGenerator.this.shim()).getHeight() + "px")  + ";width:" + ((CommonStyles_CommonStylesDefaultAppearance_CommonDefaultResources_safari_default_InlineClientBundleGenerator.this.shim()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:") + (("url(\"" + (CommonStyles_CommonStylesDefaultAppearance_CommonDefaultResources_safari_default_InlineClientBundleGenerator.this.shim()).getSafeUri().asString() + "\") -" + (CommonStyles_CommonStylesDefaultAppearance_CommonDefaultResources_safari_default_InlineClientBundleGenerator.this.shim()).getLeft() + "px -" + (CommonStyles_CommonStylesDefaultAppearance_CommonDefaultResources_safari_default_InlineClientBundleGenerator.this.shim()).getTop() + "px  no-repeat")  + ";width:" + ("100%")  + ";height:" + ("100%")  + ";display:" + ("none")  + ";position:" + ("absolute")  + ";right:" + ("0")  + ";top:" + ("0")  + ";z-index:" + ("20000")  + ";}.GB2UA-DDOJ *{color:" + ("gray")  + " !important;cursor:" + ("default")  + " !important;}.GB2UA-DDOJ{cursor:" + ("default") ) + (" !important;opacity:" + ("0.6")  + ";}")) : ((".GB2UA-DDFK,.GB2UA-DDFK:focus{outline:" + ("none")  + ";}.GB2UA-DDIK{position:" + ("absolute")  + " !important;left:" + ("0")  + ";top:" + ("0")  + ";}.GB2UA-DDAK{display:" + ("none")  + " !important;}.GB2UA-DDBK{position:" + ("absolute")  + " !important;left:" + ("-10000px")  + " !important;top:" + ("-10000px")  + " !important;visibility:" + ("hidden")  + " !important;}.GB2UA-DDCK{visibility:" + ("hidden")  + " !important;}.GB2UA-DDLK,.GB2UA-DDLK *{-moz-user-select:") + (("none")  + ";-khtml-user-select:" + ("none")  + ";-webkit-user-select:" + ("ignore")  + ";}.GB2UA-DDMK{-moz-user-select:" + ("-moz-none")  + ";-khtml-user-select:" + ("none")  + ";-webkit-user-select:" + ("ignore")  + ";}.x-clear{clear:" + ("both")  + ";overflow:" + ("hidden")  + ";line-height:" + ("0")  + ";font-size:" + ("0")  + ";}.GB2UA-DDPJ{float:" + ("right") ) + (";}.GB2UA-DDMJ{cursor:" + ("e-resize")  + ";cursor:" + ("col-resize")  + ";}.GB2UA-DDNJ{cursor:" + ("n-resize")  + ";cursor:" + ("row-resize")  + ";}.GB2UA-DDEK{position:" + ("relative")  + ";display:" + ("inline-block")  + ";}.GB2UA-DDHK{white-space:" + ("nowrap")  + ";}.GB2UA-DDKK{height:" + ((CommonStyles_CommonStylesDefaultAppearance_CommonDefaultResources_safari_default_InlineClientBundleGenerator.this.shim()).getHeight() + "px")  + ";width:" + ((CommonStyles_CommonStylesDefaultAppearance_CommonDefaultResources_safari_default_InlineClientBundleGenerator.this.shim()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:") + (("url(\"" + (CommonStyles_CommonStylesDefaultAppearance_CommonDefaultResources_safari_default_InlineClientBundleGenerator.this.shim()).getSafeUri().asString() + "\") -" + (CommonStyles_CommonStylesDefaultAppearance_CommonDefaultResources_safari_default_InlineClientBundleGenerator.this.shim()).getLeft() + "px -" + (CommonStyles_CommonStylesDefaultAppearance_CommonDefaultResources_safari_default_InlineClientBundleGenerator.this.shim()).getTop() + "px  no-repeat")  + ";width:" + ("100%")  + ";height:" + ("100%")  + ";display:" + ("none")  + ";position:" + ("absolute")  + ";left:" + ("0")  + ";top:" + ("0")  + ";z-index:" + ("20000")  + ";}.GB2UA-DDOJ *{color:" + ("gray")  + " !important;cursor:" + ("default")  + " !important;}.GB2UA-DDOJ{cursor:" + ("default") ) + (" !important;opacity:" + ("0.6")  + ";}"));
      }
      public java.lang.String clear(){
        return "x-clear";
      }
      public java.lang.String columnResize(){
        return "GB2UA-DDMJ";
      }
      public java.lang.String columnRowResize(){
        return "GB2UA-DDNJ";
      }
      public java.lang.String disabled(){
        return "GB2UA-DDOJ";
      }
      public java.lang.String floatRight(){
        return "GB2UA-DDPJ";
      }
      public java.lang.String hideDisplay(){
        return "GB2UA-DDAK";
      }
      public java.lang.String hideOffsets(){
        return "GB2UA-DDBK";
      }
      public java.lang.String hideVisibility(){
        return "GB2UA-DDCK";
      }
      public java.lang.String ignore(){
        return "GB2UA-DDDK";
      }
      public java.lang.String inlineBlock(){
        return "GB2UA-DDEK";
      }
      public java.lang.String noFocusOutline(){
        return "GB2UA-DDFK";
      }
      public java.lang.String nodrag(){
        return "GB2UA-DDGK";
      }
      public java.lang.String nowrap(){
        return "GB2UA-DDHK";
      }
      public java.lang.String positionable(){
        return "GB2UA-DDIK";
      }
      public java.lang.String repaint(){
        return "GB2UA-DDJK";
      }
      public java.lang.String shim(){
        return "GB2UA-DDKK";
      }
      public java.lang.String unselectable(){
        return "GB2UA-DDLK";
      }
      public java.lang.String unselectableSingle(){
        return "GB2UA-DDMK";
      }
    }
    ;
  }
  private static class stylesInitializer {
    static {
      _instance0.stylesInitializer();
    }
    static com.sencha.gxt.core.client.resources.CommonStyles.CommonStylesDefaultAppearance.CommonDefaultStyles get() {
      return styles;
    }
  }
  public com.sencha.gxt.core.client.resources.CommonStyles.CommonStylesDefaultAppearance.CommonDefaultStyles styles() {
    return stylesInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String externalImage = "data:image/gif;base64,R0lGODlhAQABAID/AMDAwAAAACH5BAEAAAAALAAAAAABAAEAAAICRAEAOw==";
  private static com.google.gwt.resources.client.ImageResource shim;
  private static com.sencha.gxt.core.client.resources.CommonStyles.CommonStylesDefaultAppearance.CommonDefaultStyles styles;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      shim(), 
      styles(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("shim", shim());
        resourceMap.put("styles", styles());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'shim': return this.@com.sencha.gxt.core.client.resources.CommonStyles.CommonStylesDefaultAppearance.CommonDefaultResources::shim()();
      case 'styles': return this.@com.sencha.gxt.core.client.resources.CommonStyles.CommonStylesDefaultAppearance.CommonDefaultResources::styles()();
    }
    return null;
  }-*/;
}

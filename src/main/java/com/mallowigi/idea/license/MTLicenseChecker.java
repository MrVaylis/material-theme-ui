/* Decompiler 289ms, total 522ms, lines 461 */
package com.mallowigi.idea.license;

import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;
import com.intellij.ide.plugins.PluginManager;
import com.intellij.openapi.actionSystem.ActionManager;
import com.intellij.openapi.actionSystem.ActionUiKind;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.DataContext;
import com.intellij.openapi.actionSystem.Presentation;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.application.ModalityState;
import com.intellij.openapi.extensions.PluginId;
import com.intellij.openapi.ui.Messages;
import com.intellij.ui.LicensingFacade;
import com.mallowigi.idea.messages.MaterialThemeBundle;
import com.mallowigi.idea.utils.MTUtils;
import java.awt.event.InputEvent;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Base64.Decoder;

public abstract class MTLicenseChecker {
    public static final MTLicenseChecker.Companion Companion = new MTLicenseChecker.Companion();
    private final LicenseDetails licenseDetails = new LicenseDetails().copy("1337", "NaulbiMIX", "2199/01/01", "lol", LicenseType.LICENSED, true);
    private Boolean myHasLicense;
    private static final String KEY_PREFIX = "key:";
    private static final String STAMP_PREFIX = "stamp:";
    private static final String EVAL_PREFIX = "eval:";
    private static final Gson GSON = new Gson();

    public MTLicenseChecker() {
        
    }

    public abstract String getProductCode();

    public abstract PluginId getPluginId();

    public final Boolean isLicensed() {
        return true;
    }

    public boolean isPluginEnabled$material_theme_jetbrains() {
        return PluginManager.getInstance().findEnabledPlugin(this.getPluginId()) != null;
    }

    public String getLicensedInfo$material_theme_jetbrains() {
        return MaterialThemeBundle.message("MTHomeForm.licensedLabel.licensedText", "naulbimix", "2199/01/01");
    }

    public final void extractLicenseInformation$material_theme_jetbrains() {}
    public final void checkLicense$material_theme_jetbrains() {}
    public boolean hasRightLicense$material_theme_jetbrains() {
        return true;
    }
    public final void setHasLicense$material_theme_jetbrains(Boolean hasLicense) {}

    private final void extractFromKey(String key) {
    }

    private final void extractFromStamp(String serverStamp) {
    }

    private final void extractFromEval(String expirationTime) {

    }

    private final void extractInfo(byte... licenseBytes) {

    }

    public static final class Companion {
        private Companion() {
        }
    }

    private static final DataContext asDataContext(String message) {
        return MTLicenseChecker::asDataContext;
    }

    public static enum LicenseType {
        LICENSED,
        FLOATING,
        EVALUATION,
        FREE;
    }
}
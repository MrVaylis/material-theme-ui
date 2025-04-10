/* Decompiler 138ms, total 314ms, lines 265 */
package com.mallowigi.idea.license;

import com.mallowigi.idea.license.MTLicenseChecker.LicenseType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 9, 0},
        k = 1,
        xi = 48,
        d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u0000 )2\u00020\u0001:\u0001)BI\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003JM\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010$\u001a\u00020\n2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\r\"\u0004\b\u001a\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u000f¨\u0006*"},
        d2 = {"Lcom/mallowigi/idea/license/LicenseDetails;", "", "id", "", "name", "paidUpTo", "machineId", "licenseType", "Lcom/mallowigi/idea/license/MTLicenseChecker$LicenseType;", "isValid", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mallowigi/idea/license/MTLicenseChecker$LicenseType;Z)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "()Z", "setValid", "(Z)V", "getLicenseType", "()Lcom/mallowigi/idea/license/MTLicenseChecker$LicenseType;", "setLicenseType", "(Lcom/mallowigi/idea/license/MTLicenseChecker$LicenseType;)V", "getMachineId", "setMachineId", "getName", "setName", "getPaidUpTo", "setPaidUpTo", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "material-theme-jetbrains"}
)
public final class LicenseDetails {
    public static final LicenseDetails.Companion Companion = new LicenseDetails.Companion();
    private String id;
    private String name;
    private String paidUpTo;
    private String machineId;
    private LicenseType licenseType;
    private boolean isValid;
    public static final String LICENSE_ID = "licenseId";
    public static final String LICENSEE_NAME = "licenseeName";
    public static final String PRODUCTS = "products";
    public static final String CODE = "code";
    public static final String PAID_UP_TO = "paidUpTo";

    public LicenseDetails(String id, String name, String paidUpTo, String machineId, LicenseType licenseType, boolean isValid) {
        this.id = id;
        this.name = name;
        this.paidUpTo = paidUpTo;
        this.machineId = machineId;
        this.licenseType = licenseType;
        this.isValid = isValid;
    }

    public LicenseDetails(String var1, String var2, String var3, String var4, LicenseType var5, boolean var6, int var7, DefaultConstructorMarker var8) {
        if ((var7 & 1) != 0) {
            var1 = "1337";
        }

        if ((var7 & 2) != 0) {
            var2 = "NaulbiMIX";
        }

        if ((var7 & 4) != 0) {
            var3 = "2199/01/01";
        }

        if ((var7 & 8) != 0) {
            var4 = "lol";
        }

        if ((var7 & 16) != 0) {
            var5 = LicenseType.LICENSED;
        }

        if ((var7 & 32) != 0) {
            var6 = true;
        }

        this.id = var1;
        this.name = var2;
        this.paidUpTo = var3;
        this.machineId = var4;
        this.licenseType = var5;
        this.isValid = var6;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    public final void setId(String var1) {
        this.id = var1;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final void setName(String var1) {
        this.name = var1;
    }

    @Nullable
    public final String getPaidUpTo() {
        return this.paidUpTo;
    }

    public final void setPaidUpTo(String var1) {
        this.paidUpTo = var1;
    }

    @Nullable
    public final String getMachineId() {
        return this.machineId;
    }

    public final void setMachineId(String var1) {
        this.machineId = var1;
    }

    @NotNull
    public final LicenseType getLicenseType() {
        return this.licenseType;
    }

    public final void setLicenseType(@NotNull LicenseType var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.licenseType = var1;
    }

    public final boolean isValid() {
        return this.isValid;
    }

    public final void setValid(boolean var1) {
        this.isValid = var1;
    }

    @Nullable
    public final String component1() {
        return this.id;
    }

    @Nullable
    public final String component2() {
        return this.name;
    }

    @Nullable
    public final String component3() {
        return this.paidUpTo;
    }

    @Nullable
    public final String component4() {
        return this.machineId;
    }

    @NotNull
    public final LicenseType component5() {
        return this.licenseType;
    }

    public final boolean component6() {
        return this.isValid;
    }

    @NotNull
    public final LicenseDetails copy(String id, String name, String paidUpTo, String machineId, @NotNull LicenseType licenseType, boolean isValid) {
        Intrinsics.checkNotNullParameter(licenseType, "licenseType");
        return new LicenseDetails(id, name, paidUpTo, machineId, licenseType, isValid);
    }

    @NotNull
    public String toString() {
        return "LicenseDetails(id=" + this.id + ", name=" + this.name + ", paidUpTo=" + this.paidUpTo + ", machineId=" + this.machineId + ", licenseType=" + this.licenseType + ", isValid=" + this.isValid + ")";
    }

    public LicenseDetails() {
        this("1337", "NaulbiMIX", "2199/01/01", "lol", LicenseType.LICENSED, true, 63, (DefaultConstructorMarker)null);
    }

    public static final class Companion {
        private Companion() {
        }
    }
}
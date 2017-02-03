package activitystarter;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.CLASS;

/**
 * Denote that the view specified by the injection is not required to be present.
 * <pre><code>
 * {@literal @}Optional @OnClick(R.id.subtitle) void onSubtitleClick() {}
 * </code></pre>
 */
@Retention(CLASS) @Target(FIELD)
public @interface Optional {
}
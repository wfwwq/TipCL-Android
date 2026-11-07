package org.lwjgl.openal;

import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-openal.jar:org/lwjgl/openal/EXTEfx.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-openal.jar:org/lwjgl/openal/EXTEfx.class */
public class EXTEfx {
    public static final int ALC_EFX_MAJOR_VERSION = 131073;
    public static final int ALC_EFX_MINOR_VERSION = 131074;
    public static final int ALC_MAX_AUXILIARY_SENDS = 131075;
    public static final int AL_METERS_PER_UNIT = 131076;
    public static final int AL_DIRECT_FILTER = 131077;
    public static final int AL_AUXILIARY_SEND_FILTER = 131078;
    public static final int AL_AIR_ABSORPTION_FACTOR = 131079;
    public static final int AL_ROOM_ROLLOFF_FACTOR = 131080;
    public static final int AL_CONE_OUTER_GAINHF = 131081;
    public static final int AL_DIRECT_FILTER_GAINHF_AUTO = 131082;
    public static final int AL_AUXILIARY_SEND_FILTER_GAIN_AUTO = 131083;
    public static final int AL_AUXILIARY_SEND_FILTER_GAINHF_AUTO = 131084;
    public static final int AL_EFFECTSLOT_NULL = 0;
    public static final int AL_EFFECTSLOT_EFFECT = 1;
    public static final int AL_EFFECTSLOT_GAIN = 2;
    public static final int AL_EFFECTSLOT_AUXILIARY_SEND_AUTO = 3;
    public static final int AL_REVERB_DENSITY = 1;
    public static final int AL_REVERB_DIFFUSION = 2;
    public static final int AL_REVERB_GAIN = 3;
    public static final int AL_REVERB_GAINHF = 4;
    public static final int AL_REVERB_DECAY_TIME = 5;
    public static final int AL_REVERB_DECAY_HFRATIO = 6;
    public static final int AL_REVERB_REFLECTIONS_GAIN = 7;
    public static final int AL_REVERB_REFLECTIONS_DELAY = 8;
    public static final int AL_REVERB_LATE_REVERB_GAIN = 9;
    public static final int AL_REVERB_LATE_REVERB_DELAY = 10;
    public static final int AL_REVERB_AIR_ABSORPTION_GAINHF = 11;
    public static final int AL_REVERB_ROOM_ROLLOFF_FACTOR = 12;
    public static final int AL_REVERB_DECAY_HFLIMIT = 13;
    public static final int AL_EAXREVERB_DENSITY = 1;
    public static final int AL_EAXREVERB_DIFFUSION = 2;
    public static final int AL_EAXREVERB_GAIN = 3;
    public static final int AL_EAXREVERB_GAINHF = 4;
    public static final int AL_EAXREVERB_GAINLF = 5;
    public static final int AL_EAXREVERB_DECAY_TIME = 6;
    public static final int AL_EAXREVERB_DECAY_HFRATIO = 7;
    public static final int AL_EAXREVERB_DECAY_LFRATIO = 8;
    public static final int AL_EAXREVERB_REFLECTIONS_GAIN = 9;
    public static final int AL_EAXREVERB_REFLECTIONS_DELAY = 10;
    public static final int AL_EAXREVERB_REFLECTIONS_PAN = 11;
    public static final int AL_EAXREVERB_LATE_REVERB_GAIN = 12;
    public static final int AL_EAXREVERB_LATE_REVERB_DELAY = 13;
    public static final int AL_EAXREVERB_LATE_REVERB_PAN = 14;
    public static final int AL_EAXREVERB_ECHO_TIME = 15;
    public static final int AL_EAXREVERB_ECHO_DEPTH = 16;
    public static final int AL_EAXREVERB_MODULATION_TIME = 17;
    public static final int AL_EAXREVERB_MODULATION_DEPTH = 18;
    public static final int AL_EAXREVERB_AIR_ABSORPTION_GAINHF = 19;
    public static final int AL_EAXREVERB_HFREFERENCE = 20;
    public static final int AL_EAXREVERB_LFREFERENCE = 21;
    public static final int AL_EAXREVERB_ROOM_ROLLOFF_FACTOR = 22;
    public static final int AL_EAXREVERB_DECAY_HFLIMIT = 23;
    public static final int AL_CHORUS_WAVEFORM = 1;
    public static final int AL_CHORUS_PHASE = 2;
    public static final int AL_CHORUS_RATE = 3;
    public static final int AL_CHORUS_DEPTH = 4;
    public static final int AL_CHORUS_FEEDBACK = 5;
    public static final int AL_CHORUS_DELAY = 6;
    public static final int AL_DISTORTION_EDGE = 1;
    public static final int AL_DISTORTION_GAIN = 2;
    public static final int AL_DISTORTION_LOWPASS_CUTOFF = 3;
    public static final int AL_DISTORTION_EQCENTER = 4;
    public static final int AL_DISTORTION_EQBANDWIDTH = 5;
    public static final int AL_ECHO_DELAY = 1;
    public static final int AL_ECHO_LRDELAY = 2;
    public static final int AL_ECHO_DAMPING = 3;
    public static final int AL_ECHO_FEEDBACK = 4;
    public static final int AL_ECHO_SPREAD = 5;
    public static final int AL_FLANGER_WAVEFORM = 1;
    public static final int AL_FLANGER_PHASE = 2;
    public static final int AL_FLANGER_RATE = 3;
    public static final int AL_FLANGER_DEPTH = 4;
    public static final int AL_FLANGER_FEEDBACK = 5;
    public static final int AL_FLANGER_DELAY = 6;
    public static final int AL_FREQUENCY_SHIFTER_FREQUENCY = 1;
    public static final int AL_FREQUENCY_SHIFTER_LEFT_DIRECTION = 2;
    public static final int AL_FREQUENCY_SHIFTER_RIGHT_DIRECTION = 3;
    public static final int AL_VOCMORPHER_PHONEMEA = 1;
    public static final int AL_VOCMORPHER_PHONEMEA_COARSE_TUNING = 2;
    public static final int AL_VOCMORPHER_PHONEMEB = 3;
    public static final int AL_VOCMORPHER_PHONEMEB_COARSE_TUNING = 4;
    public static final int AL_VOCMORPHER_WAVEFORM = 5;
    public static final int AL_VOCMORPHER_RATE = 6;
    public static final int AL_PITCH_SHIFTER_COARSE_TUNE = 1;
    public static final int AL_PITCH_SHIFTER_FINE_TUNE = 2;
    public static final int AL_RING_MODULATOR_FREQUENCY = 1;
    public static final int AL_RING_MODULATOR_HIGHPASS_CUTOFF = 2;
    public static final int AL_RING_MODULATOR_WAVEFORM = 3;
    public static final int AL_AUTOWAH_ATTACK_TIME = 1;
    public static final int AL_AUTOWAH_RELEASE_TIME = 2;
    public static final int AL_AUTOWAH_RESONANCE = 3;
    public static final int AL_AUTOWAH_PEAK_GAIN = 4;
    public static final int AL_COMPRESSOR_ONOFF = 1;
    public static final int AL_EQUALIZER_LOW_GAIN = 1;
    public static final int AL_EQUALIZER_LOW_CUTOFF = 2;
    public static final int AL_EQUALIZER_MID1_GAIN = 3;
    public static final int AL_EQUALIZER_MID1_CENTER = 4;
    public static final int AL_EQUALIZER_MID1_WIDTH = 5;
    public static final int AL_EQUALIZER_MID2_GAIN = 6;
    public static final int AL_EQUALIZER_MID2_CENTER = 7;
    public static final int AL_EQUALIZER_MID2_WIDTH = 8;
    public static final int AL_EQUALIZER_HIGH_GAIN = 9;
    public static final int AL_EQUALIZER_HIGH_CUTOFF = 10;
    public static final int AL_EFFECT_FIRST_PARAMETER = 0;
    public static final int AL_EFFECT_LAST_PARAMETER = 32768;
    public static final int AL_EFFECT_TYPE = 32769;
    public static final int AL_EFFECT_NULL = 0;
    public static final int AL_EFFECT_REVERB = 1;
    public static final int AL_EFFECT_CHORUS = 2;
    public static final int AL_EFFECT_DISTORTION = 3;
    public static final int AL_EFFECT_ECHO = 4;
    public static final int AL_EFFECT_FLANGER = 5;
    public static final int AL_EFFECT_FREQUENCY_SHIFTER = 6;
    public static final int AL_EFFECT_VOCAL_MORPHER = 7;
    public static final int AL_EFFECT_PITCH_SHIFTER = 8;
    public static final int AL_EFFECT_RING_MODULATOR = 9;
    public static final int AL_EFFECT_AUTOWAH = 10;
    public static final int AL_EFFECT_COMPRESSOR = 11;
    public static final int AL_EFFECT_EQUALIZER = 12;
    public static final int AL_EFFECT_EAXREVERB = 32768;
    public static final int AL_LOWPASS_GAIN = 1;
    public static final int AL_LOWPASS_GAINHF = 2;
    public static final int AL_HIGHPASS_GAIN = 1;
    public static final int AL_HIGHPASS_GAINLF = 2;
    public static final int AL_BANDPASS_GAIN = 1;
    public static final int AL_BANDPASS_GAINLF = 2;
    public static final int AL_BANDPASS_GAINHF = 3;
    public static final int AL_FILTER_FIRST_PARAMETER = 0;
    public static final int AL_FILTER_LAST_PARAMETER = 32768;
    public static final int AL_FILTER_TYPE = 32769;
    public static final int AL_FILTER_NULL = 0;
    public static final int AL_FILTER_LOWPASS = 1;
    public static final int AL_FILTER_HIGHPASS = 2;
    public static final int AL_FILTER_BANDPASS = 3;
    public static final float AL_MIN_AIR_ABSORPTION_FACTOR = 0.0f;
    public static final float AL_MAX_AIR_ABSORPTION_FACTOR = 10.0f;
    public static final float AL_DEFAULT_AIR_ABSORPTION_FACTOR = 0.0f;
    public static final float AL_MIN_ROOM_ROLLOFF_FACTOR = 0.0f;
    public static final float AL_MAX_ROOM_ROLLOFF_FACTOR = 10.0f;
    public static final float AL_DEFAULT_ROOM_ROLLOFF_FACTOR = 0.0f;
    public static final float AL_MIN_CONE_OUTER_GAINHF = 0.0f;
    public static final float AL_MAX_CONE_OUTER_GAINHF = 1.0f;
    public static final float AL_DEFAULT_CONE_OUTER_GAINHF = 1.0f;
    public static final int AL_MIN_DIRECT_FILTER_GAINHF_AUTO = 0;
    public static final int AL_MAX_DIRECT_FILTER_GAINHF_AUTO = 1;
    public static final int AL_DEFAULT_DIRECT_FILTER_GAINHF_AUTO = 1;
    public static final int AL_MIN_AUXILIARY_SEND_FILTER_GAIN_AUTO = 0;
    public static final int AL_MAX_AUXILIARY_SEND_FILTER_GAIN_AUTO = 1;
    public static final int AL_DEFAULT_AUXILIARY_SEND_FILTER_GAIN_AUTO = 1;
    public static final int AL_MIN_AUXILIARY_SEND_FILTER_GAINHF_AUTO = 0;
    public static final int AL_MAX_AUXILIARY_SEND_FILTER_GAINHF_AUTO = 1;
    public static final int AL_DEFAULT_AUXILIARY_SEND_FILTER_GAINHF_AUTO = 1;
    public static final float AL_MIN_METERS_PER_UNIT = Float.MIN_VALUE;
    public static final float AL_MAX_METERS_PER_UNIT = Float.MAX_VALUE;
    public static final float AL_DEFAULT_METERS_PER_UNIT = 1.0f;
    public static final float AL_REVERB_MIN_DENSITY = 0.0f;
    public static final float AL_REVERB_MAX_DENSITY = 1.0f;
    public static final float AL_REVERB_DEFAULT_DENSITY = 1.0f;
    public static final float AL_REVERB_MIN_DIFFUSION = 0.0f;
    public static final float AL_REVERB_MAX_DIFFUSION = 1.0f;
    public static final float AL_REVERB_DEFAULT_DIFFUSION = 1.0f;
    public static final float AL_REVERB_MIN_GAIN = 0.0f;
    public static final float AL_REVERB_MAX_GAIN = 1.0f;
    public static final float AL_REVERB_DEFAULT_GAIN = 0.32f;
    public static final float AL_REVERB_MIN_GAINHF = 0.0f;
    public static final float AL_REVERB_MAX_GAINHF = 1.0f;
    public static final float AL_REVERB_DEFAULT_GAINHF = 0.89f;
    public static final float AL_REVERB_MIN_DECAY_TIME = 0.1f;
    public static final float AL_REVERB_MAX_DECAY_TIME = 20.0f;
    public static final float AL_REVERB_DEFAULT_DECAY_TIME = 1.49f;
    public static final float AL_REVERB_MIN_DECAY_HFRATIO = 0.1f;
    public static final float AL_REVERB_MAX_DECAY_HFRATIO = 2.0f;
    public static final float AL_REVERB_DEFAULT_DECAY_HFRATIO = 0.83f;
    public static final float AL_REVERB_MIN_REFLECTIONS_GAIN = 0.0f;
    public static final float AL_REVERB_MAX_REFLECTIONS_GAIN = 3.16f;
    public static final float AL_REVERB_DEFAULT_REFLECTIONS_GAIN = 0.05f;
    public static final float AL_REVERB_MIN_REFLECTIONS_DELAY = 0.0f;
    public static final float AL_REVERB_MAX_REFLECTIONS_DELAY = 0.3f;
    public static final float AL_REVERB_DEFAULT_REFLECTIONS_DELAY = 0.007f;
    public static final float AL_REVERB_MIN_LATE_REVERB_GAIN = 0.0f;
    public static final float AL_REVERB_MAX_LATE_REVERB_GAIN = 10.0f;
    public static final float AL_REVERB_DEFAULT_LATE_REVERB_GAIN = 1.26f;
    public static final float AL_REVERB_MIN_LATE_REVERB_DELAY = 0.0f;
    public static final float AL_REVERB_MAX_LATE_REVERB_DELAY = 0.1f;
    public static final float AL_REVERB_DEFAULT_LATE_REVERB_DELAY = 0.011f;
    public static final float AL_REVERB_MIN_AIR_ABSORPTION_GAINHF = 0.892f;
    public static final float AL_REVERB_MAX_AIR_ABSORPTION_GAINHF = 1.0f;
    public static final float AL_REVERB_DEFAULT_AIR_ABSORPTION_GAINHF = 0.994f;
    public static final float AL_REVERB_MIN_ROOM_ROLLOFF_FACTOR = 0.0f;
    public static final float AL_REVERB_MAX_ROOM_ROLLOFF_FACTOR = 10.0f;
    public static final float AL_REVERB_DEFAULT_ROOM_ROLLOFF_FACTOR = 0.0f;
    public static final int AL_REVERB_MIN_DECAY_HFLIMIT = 0;
    public static final int AL_REVERB_MAX_DECAY_HFLIMIT = 1;
    public static final int AL_REVERB_DEFAULT_DECAY_HFLIMIT = 1;
    public static final float AL_EAXREVERB_MIN_DENSITY = 0.0f;
    public static final float AL_EAXREVERB_MAX_DENSITY = 1.0f;
    public static final float AL_EAXREVERB_DEFAULT_DENSITY = 1.0f;
    public static final float AL_EAXREVERB_MIN_DIFFUSION = 0.0f;
    public static final float AL_EAXREVERB_MAX_DIFFUSION = 1.0f;
    public static final float AL_EAXREVERB_DEFAULT_DIFFUSION = 1.0f;
    public static final float AL_EAXREVERB_MIN_GAIN = 0.0f;
    public static final float AL_EAXREVERB_MAX_GAIN = 1.0f;
    public static final float AL_EAXREVERB_DEFAULT_GAIN = 0.32f;
    public static final float AL_EAXREVERB_MIN_GAINHF = 0.0f;
    public static final float AL_EAXREVERB_MAX_GAINHF = 1.0f;
    public static final float AL_EAXREVERB_DEFAULT_GAINHF = 0.89f;
    public static final float AL_EAXREVERB_MIN_GAINLF = 0.0f;
    public static final float AL_EAXREVERB_MAX_GAINLF = 1.0f;
    public static final float AL_EAXREVERB_DEFAULT_GAINLF = 1.0f;
    public static final float AL_EAXREVERB_MIN_DECAY_TIME = 0.1f;
    public static final float AL_EAXREVERB_MAX_DECAY_TIME = 20.0f;
    public static final float AL_EAXREVERB_DEFAULT_DECAY_TIME = 1.49f;
    public static final float AL_EAXREVERB_MIN_DECAY_HFRATIO = 0.1f;
    public static final float AL_EAXREVERB_MAX_DECAY_HFRATIO = 2.0f;
    public static final float AL_EAXREVERB_DEFAULT_DECAY_HFRATIO = 0.83f;
    public static final float AL_EAXREVERB_MIN_DECAY_LFRATIO = 0.1f;
    public static final float AL_EAXREVERB_MAX_DECAY_LFRATIO = 2.0f;
    public static final float AL_EAXREVERB_DEFAULT_DECAY_LFRATIO = 1.0f;
    public static final float AL_EAXREVERB_MIN_REFLECTIONS_GAIN = 0.0f;
    public static final float AL_EAXREVERB_MAX_REFLECTIONS_GAIN = 3.16f;
    public static final float AL_EAXREVERB_DEFAULT_REFLECTIONS_GAIN = 0.05f;
    public static final float AL_EAXREVERB_MIN_REFLECTIONS_DELAY = 0.0f;
    public static final float AL_EAXREVERB_MAX_REFLECTIONS_DELAY = 0.3f;
    public static final float AL_EAXREVERB_DEFAULT_REFLECTIONS_DELAY = 0.007f;
    public static final float AL_EAXREVERB_DEFAULT_REFLECTIONS_PAN_XYZ = 0.0f;
    public static final float AL_EAXREVERB_MIN_LATE_REVERB_GAIN = 0.0f;
    public static final float AL_EAXREVERB_MAX_LATE_REVERB_GAIN = 10.0f;
    public static final float AL_EAXREVERB_DEFAULT_LATE_REVERB_GAIN = 1.26f;
    public static final float AL_EAXREVERB_MIN_LATE_REVERB_DELAY = 0.0f;
    public static final float AL_EAXREVERB_MAX_LATE_REVERB_DELAY = 0.1f;
    public static final float AL_EAXREVERB_DEFAULT_LATE_REVERB_DELAY = 0.011f;
    public static final float AL_EAXREVERB_DEFAULT_LATE_REVERB_PAN_XYZ = 0.0f;
    public static final float AL_EAXREVERB_MIN_ECHO_TIME = 0.075f;
    public static final float AL_EAXREVERB_MAX_ECHO_TIME = 0.25f;
    public static final float AL_EAXREVERB_DEFAULT_ECHO_TIME = 0.25f;
    public static final float AL_EAXREVERB_MIN_ECHO_DEPTH = 0.0f;
    public static final float AL_EAXREVERB_MAX_ECHO_DEPTH = 1.0f;
    public static final float AL_EAXREVERB_DEFAULT_ECHO_DEPTH = 0.0f;
    public static final float AL_EAXREVERB_MIN_MODULATION_TIME = 0.04f;
    public static final float AL_EAXREVERB_MAX_MODULATION_TIME = 4.0f;
    public static final float AL_EAXREVERB_DEFAULT_MODULATION_TIME = 0.25f;
    public static final float AL_EAXREVERB_MIN_MODULATION_DEPTH = 0.0f;
    public static final float AL_EAXREVERB_MAX_MODULATION_DEPTH = 1.0f;
    public static final float AL_EAXREVERB_DEFAULT_MODULATION_DEPTH = 0.0f;
    public static final float AL_EAXREVERB_MIN_AIR_ABSORPTION_GAINHF = 0.892f;
    public static final float AL_EAXREVERB_MAX_AIR_ABSORPTION_GAINHF = 1.0f;
    public static final float AL_EAXREVERB_DEFAULT_AIR_ABSORPTION_GAINHF = 0.994f;
    public static final float AL_EAXREVERB_MIN_HFREFERENCE = 1000.0f;
    public static final float AL_EAXREVERB_MAX_HFREFERENCE = 20000.0f;
    public static final float AL_EAXREVERB_DEFAULT_HFREFERENCE = 5000.0f;
    public static final float AL_EAXREVERB_MIN_LFREFERENCE = 20.0f;
    public static final float AL_EAXREVERB_MAX_LFREFERENCE = 1000.0f;
    public static final float AL_EAXREVERB_DEFAULT_LFREFERENCE = 250.0f;
    public static final float AL_EAXREVERB_MIN_ROOM_ROLLOFF_FACTOR = 0.0f;
    public static final float AL_EAXREVERB_MAX_ROOM_ROLLOFF_FACTOR = 10.0f;
    public static final float AL_EAXREVERB_DEFAULT_ROOM_ROLLOFF_FACTOR = 0.0f;
    public static final int AL_EAXREVERB_MIN_DECAY_HFLIMIT = 0;
    public static final int AL_EAXREVERB_MAX_DECAY_HFLIMIT = 1;
    public static final int AL_EAXREVERB_DEFAULT_DECAY_HFLIMIT = 1;
    public static final int AL_CHORUS_WAVEFORM_SINUSOID = 0;
    public static final int AL_CHORUS_WAVEFORM_TRIANGLE = 1;
    public static final int AL_CHORUS_MIN_WAVEFORM = 0;
    public static final int AL_CHORUS_MAX_WAVEFORM = 1;
    public static final int AL_CHORUS_DEFAULT_WAVEFORM = 1;
    public static final int AL_CHORUS_MIN_PHASE = -180;
    public static final int AL_CHORUS_MAX_PHASE = 180;
    public static final int AL_CHORUS_DEFAULT_PHASE = 90;
    public static final float AL_CHORUS_MIN_RATE = 0.0f;
    public static final float AL_CHORUS_MAX_RATE = 10.0f;
    public static final float AL_CHORUS_DEFAULT_RATE = 1.1f;
    public static final float AL_CHORUS_MIN_DEPTH = 0.0f;
    public static final float AL_CHORUS_MAX_DEPTH = 1.0f;
    public static final float AL_CHORUS_DEFAULT_DEPTH = 0.1f;
    public static final float AL_CHORUS_MIN_FEEDBACK = -1.0f;
    public static final float AL_CHORUS_MAX_FEEDBACK = 1.0f;
    public static final float AL_CHORUS_DEFAULT_FEEDBACK = 0.25f;
    public static final float AL_CHORUS_MIN_DELAY = 0.0f;
    public static final float AL_CHORUS_MAX_DELAY = 0.016f;
    public static final float AL_CHORUS_DEFAULT_DELAY = 0.016f;
    public static final float AL_DISTORTION_MIN_EDGE = 0.0f;
    public static final float AL_DISTORTION_MAX_EDGE = 1.0f;
    public static final float AL_DISTORTION_DEFAULT_EDGE = 0.2f;
    public static final float AL_DISTORTION_MIN_GAIN = 0.01f;
    public static final float AL_DISTORTION_MAX_GAIN = 1.0f;
    public static final float AL_DISTORTION_DEFAULT_GAIN = 0.05f;
    public static final float AL_DISTORTION_MIN_LOWPASS_CUTOFF = 80.0f;
    public static final float AL_DISTORTION_MAX_LOWPASS_CUTOFF = 24000.0f;
    public static final float AL_DISTORTION_DEFAULT_LOWPASS_CUTOFF = 8000.0f;
    public static final float AL_DISTORTION_MIN_EQCENTER = 80.0f;
    public static final float AL_DISTORTION_MAX_EQCENTER = 24000.0f;
    public static final float AL_DISTORTION_DEFAULT_EQCENTER = 3600.0f;
    public static final float AL_DISTORTION_MIN_EQBANDWIDTH = 80.0f;
    public static final float AL_DISTORTION_MAX_EQBANDWIDTH = 24000.0f;
    public static final float AL_DISTORTION_DEFAULT_EQBANDWIDTH = 3600.0f;
    public static final float AL_ECHO_MIN_DELAY = 0.0f;
    public static final float AL_ECHO_MAX_DELAY = 0.207f;
    public static final float AL_ECHO_DEFAULT_DELAY = 0.1f;
    public static final float AL_ECHO_MIN_LRDELAY = 0.0f;
    public static final float AL_ECHO_MAX_LRDELAY = 0.404f;
    public static final float AL_ECHO_DEFAULT_LRDELAY = 0.1f;
    public static final float AL_ECHO_MIN_DAMPING = 0.0f;
    public static final float AL_ECHO_MAX_DAMPING = 0.99f;
    public static final float AL_ECHO_DEFAULT_DAMPING = 0.5f;
    public static final float AL_ECHO_MIN_FEEDBACK = 0.0f;
    public static final float AL_ECHO_MAX_FEEDBACK = 1.0f;
    public static final float AL_ECHO_DEFAULT_FEEDBACK = 0.5f;
    public static final float AL_ECHO_MIN_SPREAD = -1.0f;
    public static final float AL_ECHO_MAX_SPREAD = 1.0f;
    public static final float AL_ECHO_DEFAULT_SPREAD = -1.0f;
    public static final int AL_FLANGER_WAVEFORM_SINUSOID = 0;
    public static final int AL_FLANGER_WAVEFORM_TRIANGLE = 1;
    public static final int AL_FLANGER_MIN_WAVEFORM = 0;
    public static final int AL_FLANGER_MAX_WAVEFORM = 1;
    public static final int AL_FLANGER_DEFAULT_WAVEFORM = 1;
    public static final int AL_FLANGER_MIN_PHASE = -180;
    public static final int AL_FLANGER_MAX_PHASE = 180;
    public static final int AL_FLANGER_DEFAULT_PHASE = 0;
    public static final float AL_FLANGER_MIN_RATE = 0.0f;
    public static final float AL_FLANGER_MAX_RATE = 10.0f;
    public static final float AL_FLANGER_DEFAULT_RATE = 0.27f;
    public static final float AL_FLANGER_MIN_DEPTH = 0.0f;
    public static final float AL_FLANGER_MAX_DEPTH = 1.0f;
    public static final float AL_FLANGER_DEFAULT_DEPTH = 1.0f;
    public static final float AL_FLANGER_MIN_FEEDBACK = -1.0f;
    public static final float AL_FLANGER_MAX_FEEDBACK = 1.0f;
    public static final float AL_FLANGER_DEFAULT_FEEDBACK = -0.5f;
    public static final float AL_FLANGER_MIN_DELAY = 0.0f;
    public static final float AL_FLANGER_MAX_DELAY = 0.004f;
    public static final float AL_FLANGER_DEFAULT_DELAY = 0.002f;
    public static final float AL_FREQUENCY_SHIFTER_MIN_FREQUENCY = 0.0f;
    public static final float AL_FREQUENCY_SHIFTER_MAX_FREQUENCY = 24000.0f;
    public static final float AL_FREQUENCY_SHIFTER_DEFAULT_FREQUENCY = 0.0f;
    public static final int AL_FREQUENCY_SHIFTER_MIN_LEFT_DIRECTION = 0;
    public static final int AL_FREQUENCY_SHIFTER_MAX_LEFT_DIRECTION = 2;
    public static final int AL_FREQUENCY_SHIFTER_DEFAULT_LEFT_DIRECTION = 0;
    public static final int AL_FREQUENCY_SHIFTER_DIRECTION_DOWN = 0;
    public static final int AL_FREQUENCY_SHIFTER_DIRECTION_UP = 1;
    public static final int AL_FREQUENCY_SHIFTER_DIRECTION_OFF = 2;
    public static final int AL_FREQUENCY_SHIFTER_MIN_RIGHT_DIRECTION = 0;
    public static final int AL_FREQUENCY_SHIFTER_MAX_RIGHT_DIRECTION = 2;
    public static final int AL_FREQUENCY_SHIFTER_DEFAULT_RIGHT_DIRECTION = 0;
    public static final int AL_VOCAL_MORPHER_MIN_PHONEMEA = 0;
    public static final int AL_VOCAL_MORPHER_MAX_PHONEMEA = 29;
    public static final int AL_VOCAL_MORPHER_DEFAULT_PHONEMEA = 0;
    public static final int AL_VOCAL_MORPHER_MIN_PHONEMEA_COARSE_TUNING = -24;
    public static final int AL_VOCAL_MORPHER_MAX_PHONEMEA_COARSE_TUNING = 24;
    public static final int AL_VOCAL_MORPHER_DEFAULT_PHONEMEA_COARSE_TUNING = 0;
    public static final int AL_VOCAL_MORPHER_MIN_PHONEMEB = 0;
    public static final int AL_VOCAL_MORPHER_MAX_PHONEMEB = 29;
    public static final int AL_VOCAL_MORPHER_DEFAULT_PHONEMEB = 10;
    public static final int AL_VOCAL_MORPHER_MIN_PHONEMEB_COARSE_TUNING = -24;
    public static final int AL_VOCAL_MORPHER_MAX_PHONEMEB_COARSE_TUNING = 24;
    public static final int AL_VOCAL_MORPHER_DEFAULT_PHONEMEB_COARSE_TUNING = 0;
    public static final int AL_VOCAL_MORPHER_PHONEME_A = 0;
    public static final int AL_VOCAL_MORPHER_PHONEME_E = 1;
    public static final int AL_VOCAL_MORPHER_PHONEME_I = 2;
    public static final int AL_VOCAL_MORPHER_PHONEME_O = 3;
    public static final int AL_VOCAL_MORPHER_PHONEME_U = 4;
    public static final int AL_VOCAL_MORPHER_PHONEME_AA = 5;
    public static final int AL_VOCAL_MORPHER_PHONEME_AE = 6;
    public static final int AL_VOCAL_MORPHER_PHONEME_AH = 7;
    public static final int AL_VOCAL_MORPHER_PHONEME_AO = 8;
    public static final int AL_VOCAL_MORPHER_PHONEME_EH = 9;
    public static final int AL_VOCAL_MORPHER_PHONEME_ER = 10;
    public static final int AL_VOCAL_MORPHER_PHONEME_IH = 11;
    public static final int AL_VOCAL_MORPHER_PHONEME_IY = 12;
    public static final int AL_VOCAL_MORPHER_PHONEME_UH = 13;
    public static final int AL_VOCAL_MORPHER_PHONEME_UW = 14;
    public static final int AL_VOCAL_MORPHER_PHONEME_B = 15;
    public static final int AL_VOCAL_MORPHER_PHONEME_D = 16;
    public static final int AL_VOCAL_MORPHER_PHONEME_F = 17;
    public static final int AL_VOCAL_MORPHER_PHONEME_G = 18;
    public static final int AL_VOCAL_MORPHER_PHONEME_J = 19;
    public static final int AL_VOCAL_MORPHER_PHONEME_K = 20;
    public static final int AL_VOCAL_MORPHER_PHONEME_L = 21;
    public static final int AL_VOCAL_MORPHER_PHONEME_M = 22;
    public static final int AL_VOCAL_MORPHER_PHONEME_N = 23;
    public static final int AL_VOCAL_MORPHER_PHONEME_P = 24;
    public static final int AL_VOCAL_MORPHER_PHONEME_R = 25;
    public static final int AL_VOCAL_MORPHER_PHONEME_S = 26;
    public static final int AL_VOCAL_MORPHER_PHONEME_T = 27;
    public static final int AL_VOCAL_MORPHER_PHONEME_V = 28;
    public static final int AL_VOCAL_MORPHER_PHONEME_Z = 29;
    public static final int AL_VOCAL_MORPHER_WAVEFORM_SINUSOID = 0;
    public static final int AL_VOCAL_MORPHER_WAVEFORM_TRIANGLE = 1;
    public static final int AL_VOCAL_MORPHER_WAVEFORM_SAWTOOTH = 2;
    public static final int AL_VOCAL_MORPHER_MIN_WAVEFORM = 0;
    public static final int AL_VOCAL_MORPHER_MAX_WAVEFORM = 2;
    public static final int AL_VOCAL_MORPHER_DEFAULT_WAVEFORM = 0;
    public static final float AL_VOCAL_MORPHER_MIN_RATE = 0.0f;
    public static final float AL_VOCAL_MORPHER_MAX_RATE = 10.0f;
    public static final float AL_VOCAL_MORPHER_DEFAULT_RATE = 1.41f;
    public static final int AL_PITCH_SHIFTER_MIN_COARSE_TUNE = -12;
    public static final int AL_PITCH_SHIFTER_MAX_COARSE_TUNE = 12;
    public static final int AL_PITCH_SHIFTER_DEFAULT_COARSE_TUNE = 12;
    public static final int AL_PITCH_SHIFTER_MIN_FINE_TUNE = -50;
    public static final int AL_PITCH_SHIFTER_MAX_FINE_TUNE = 50;
    public static final int AL_PITCH_SHIFTER_DEFAULT_FINE_TUNE = 0;
    public static final float AL_RING_MODULATOR_MIN_FREQUENCY = 0.0f;
    public static final float AL_RING_MODULATOR_MAX_FREQUENCY = 8000.0f;
    public static final float AL_RING_MODULATOR_DEFAULT_FREQUENCY = 440.0f;
    public static final float AL_RING_MODULATOR_MIN_HIGHPASS_CUTOFF = 0.0f;
    public static final float AL_RING_MODULATOR_MAX_HIGHPASS_CUTOFF = 24000.0f;
    public static final float AL_RING_MODULATOR_DEFAULT_HIGHPASS_CUTOFF = 800.0f;
    public static final int AL_RING_MODULATOR_SINUSOID = 0;
    public static final int AL_RING_MODULATOR_SAWTOOTH = 1;
    public static final int AL_RING_MODULATOR_SQUARE = 2;
    public static final int AL_RING_MODULATOR_MIN_WAVEFORM = 0;
    public static final int AL_RING_MODULATOR_MAX_WAVEFORM = 2;
    public static final int AL_RING_MODULATOR_DEFAULT_WAVEFORM = 0;
    public static final float AL_AUTOWAH_MIN_ATTACK_TIME = 1.0E-4f;
    public static final float AL_AUTOWAH_MAX_ATTACK_TIME = 1.0f;
    public static final float AL_AUTOWAH_DEFAULT_ATTACK_TIME = 0.06f;
    public static final float AL_AUTOWAH_MIN_RELEASE_TIME = 1.0E-4f;
    public static final float AL_AUTOWAH_MAX_RELEASE_TIME = 1.0f;
    public static final float AL_AUTOWAH_DEFAULT_RELEASE_TIME = 0.06f;
    public static final float AL_AUTOWAH_MIN_RESONANCE = 2.0f;
    public static final float AL_AUTOWAH_MAX_RESONANCE = 1000.0f;
    public static final float AL_AUTOWAH_DEFAULT_RESONANCE = 1000.0f;
    public static final float AL_AUTOWAH_MIN_PEAK_GAIN = 3.0E-5f;
    public static final float AL_AUTOWAH_MAX_PEAK_GAIN = 31621.0f;
    public static final float AL_AUTOWAH_DEFAULT_PEAK_GAIN = 11.22f;
    public static final int AL_COMPRESSOR_MIN_ONOFF = 0;
    public static final int AL_COMPRESSOR_MAX_ONOFF = 1;
    public static final int AL_COMPRESSOR_DEFAULT_ONOFF = 1;
    public static final float AL_EQUALIZER_MIN_LOW_GAIN = 0.126f;
    public static final float AL_EQUALIZER_MAX_LOW_GAIN = 7.943f;
    public static final float AL_EQUALIZER_DEFAULT_LOW_GAIN = 1.0f;
    public static final float AL_EQUALIZER_MIN_LOW_CUTOFF = 50.0f;
    public static final float AL_EQUALIZER_MAX_LOW_CUTOFF = 800.0f;
    public static final float AL_EQUALIZER_DEFAULT_LOW_CUTOFF = 200.0f;
    public static final float AL_EQUALIZER_MIN_MID1_GAIN = 0.126f;
    public static final float AL_EQUALIZER_MAX_MID1_GAIN = 7.943f;
    public static final float AL_EQUALIZER_DEFAULT_MID1_GAIN = 1.0f;
    public static final float AL_EQUALIZER_MIN_MID1_CENTER = 200.0f;
    public static final float AL_EQUALIZER_MAX_MID1_CENTER = 3000.0f;
    public static final float AL_EQUALIZER_DEFAULT_MID1_CENTER = 500.0f;
    public static final float AL_EQUALIZER_MIN_MID1_WIDTH = 0.01f;
    public static final float AL_EQUALIZER_MAX_MID1_WIDTH = 1.0f;
    public static final float AL_EQUALIZER_DEFAULT_MID1_WIDTH = 1.0f;
    public static final float AL_EQUALIZER_MIN_MID2_GAIN = 0.126f;
    public static final float AL_EQUALIZER_MAX_MID2_GAIN = 7.943f;
    public static final float AL_EQUALIZER_DEFAULT_MID2_GAIN = 1.0f;
    public static final float AL_EQUALIZER_MIN_MID2_CENTER = 1000.0f;
    public static final float AL_EQUALIZER_MAX_MID2_CENTER = 8000.0f;
    public static final float AL_EQUALIZER_DEFAULT_MID2_CENTER = 3000.0f;
    public static final float AL_EQUALIZER_MIN_MID2_WIDTH = 0.01f;
    public static final float AL_EQUALIZER_MAX_MID2_WIDTH = 1.0f;
    public static final float AL_EQUALIZER_DEFAULT_MID2_WIDTH = 1.0f;
    public static final float AL_EQUALIZER_MIN_HIGH_GAIN = 0.126f;
    public static final float AL_EQUALIZER_MAX_HIGH_GAIN = 7.943f;
    public static final float AL_EQUALIZER_DEFAULT_HIGH_GAIN = 1.0f;
    public static final float AL_EQUALIZER_MIN_HIGH_CUTOFF = 4000.0f;
    public static final float AL_EQUALIZER_MAX_HIGH_CUTOFF = 16000.0f;
    public static final float AL_EQUALIZER_DEFAULT_HIGH_CUTOFF = 6000.0f;
    public static final float AL_LOWPASS_MIN_GAIN = 0.0f;
    public static final float AL_LOWPASS_MAX_GAIN = 1.0f;
    public static final float AL_LOWPASS_DEFAULT_GAIN = 1.0f;
    public static final float AL_LOWPASS_MIN_GAINHF = 0.0f;
    public static final float AL_LOWPASS_MAX_GAINHF = 1.0f;
    public static final float AL_LOWPASS_DEFAULT_GAINHF = 1.0f;
    public static final float AL_HIGHPASS_MIN_GAIN = 0.0f;
    public static final float AL_HIGHPASS_MAX_GAIN = 1.0f;
    public static final float AL_HIGHPASS_DEFAULT_GAIN = 1.0f;
    public static final float AL_HIGHPASS_MIN_GAINLF = 0.0f;
    public static final float AL_HIGHPASS_MAX_GAINLF = 1.0f;
    public static final float AL_HIGHPASS_DEFAULT_GAINLF = 1.0f;
    public static final float AL_BANDPASS_MIN_GAIN = 0.0f;
    public static final float AL_BANDPASS_MAX_GAIN = 1.0f;
    public static final float AL_BANDPASS_DEFAULT_GAIN = 1.0f;
    public static final float AL_BANDPASS_MIN_GAINHF = 0.0f;
    public static final float AL_BANDPASS_MAX_GAINHF = 1.0f;
    public static final float AL_BANDPASS_DEFAULT_GAINHF = 1.0f;
    public static final float AL_BANDPASS_MIN_GAINLF = 0.0f;
    public static final float AL_BANDPASS_MAX_GAINLF = 1.0f;
    public static final float AL_BANDPASS_DEFAULT_GAINLF = 1.0f;

    protected EXTEfx() {
        throw new UnsupportedOperationException();
    }

    public static void nalGenEffects(int n, long effects) {
        long __functionAddress = AL.getICD().alGenEffects;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(n, effects, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGenEffects(@NativeType("ALuint *") IntBuffer effects) {
        nalGenEffects(effects.remaining(), MemoryUtil.memAddress(effects));
    }

    @NativeType("ALvoid")
    public static int alGenEffects() {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            IntBuffer effects = stack.callocInt(1);
            nalGenEffects(1, MemoryUtil.memAddress(effects));
            int i = effects.get(0);
            stack.setPointer(stackPointer);
            return i;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nalGenEffectsDirect(long context, int n, long effects) {
        long __functionAddress = AL.getICD().alGenEffectsDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPV(context, n, effects, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGenEffectsDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint *") IntBuffer effects) {
        nalGenEffectsDirect(context, effects.remaining(), MemoryUtil.memAddress(effects));
    }

    @NativeType("ALvoid")
    public static int alGenEffectsDirect(@NativeType("ALCcontext *") long context) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            IntBuffer effects = stack.callocInt(1);
            nalGenEffectsDirect(context, 1, MemoryUtil.memAddress(effects));
            int i = effects.get(0);
            stack.setPointer(stackPointer);
            return i;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nalDeleteEffects(int n, long effects) {
        long __functionAddress = AL.getICD().alDeleteEffects;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(n, effects, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alDeleteEffects(@NativeType("ALuint *") IntBuffer effects) {
        nalDeleteEffects(effects.remaining(), MemoryUtil.memAddress(effects));
    }

    @NativeType("ALvoid")
    public static void alDeleteEffects(@NativeType("ALuint *") int effect) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            IntBuffer effects = stack.ints(effect);
            nalDeleteEffects(1, MemoryUtil.memAddress(effects));
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nalDeleteEffectsDirect(long context, int n, long effects) {
        long __functionAddress = AL.getICD().alDeleteEffectsDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPV(context, n, effects, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alDeleteEffectsDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint *") IntBuffer effects) {
        nalDeleteEffectsDirect(context, effects.remaining(), MemoryUtil.memAddress(effects));
    }

    @NativeType("ALvoid")
    public static void alDeleteEffectsDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint *") int effect) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            IntBuffer effects = stack.ints(effect);
            nalDeleteEffectsDirect(context, 1, MemoryUtil.memAddress(effects));
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("ALboolean")
    public static boolean alIsEffect(@NativeType("ALuint") int effect) {
        long __functionAddress = AL.getICD().alIsEffect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.invokeZ(effect, __functionAddress);
    }

    @NativeType("ALboolean")
    public static boolean alIsEffectDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effect) {
        long __functionAddress = AL.getICD().alIsEffectDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        return JNI.invokePZ(context, effect, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alEffecti(@NativeType("ALuint") int effect, @NativeType("ALenum") int param, @NativeType("ALint") int value) {
        long __functionAddress = AL.getICD().alEffecti;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokeV(effect, param, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alEffectiDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effect, @NativeType("ALenum") int param, @NativeType("ALint") int value) {
        long __functionAddress = AL.getICD().alEffectiDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePV(context, effect, param, value, __functionAddress);
    }

    public static void nalEffectiv(int effect, int param, long values) {
        long __functionAddress = AL.getICD().alEffectiv;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(effect, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alEffectiv(@NativeType("ALuint") int effect, @NativeType("ALenum") int param, @NativeType("ALint const *") IntBuffer values) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) values, 1);
        }
        nalEffectiv(effect, param, MemoryUtil.memAddress(values));
    }

    public static void nalEffectivDirect(long context, int effect, int param, long values) {
        long __functionAddress = AL.getICD().alEffectivDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPV(context, effect, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alEffectivDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effect, @NativeType("ALenum") int param, @NativeType("ALint const *") IntBuffer values) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) values, 1);
        }
        nalEffectivDirect(context, effect, param, MemoryUtil.memAddress(values));
    }

    @NativeType("ALvoid")
    public static void alEffectf(@NativeType("ALuint") int effect, @NativeType("ALenum") int param, @NativeType("ALfloat") float value) {
        long __functionAddress = AL.getICD().alEffectf;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokeV(effect, param, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alEffectfDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effect, @NativeType("ALenum") int param, @NativeType("ALfloat") float value) {
        long __functionAddress = AL.getICD().alEffectfDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePV(context, effect, param, value, __functionAddress);
    }

    public static void nalEffectfv(int effect, int param, long values) {
        long __functionAddress = AL.getICD().alEffectfv;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(effect, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alEffectfv(@NativeType("ALuint") int effect, @NativeType("ALenum") int param, @NativeType("ALfloat const *") FloatBuffer values) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) values, 1);
        }
        nalEffectfv(effect, param, MemoryUtil.memAddress(values));
    }

    public static void nalEffectfvDirect(long context, int effect, int param, long values) {
        long __functionAddress = AL.getICD().alEffectfvDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPV(context, effect, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alEffectfvDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effect, @NativeType("ALenum") int param, @NativeType("ALfloat const *") FloatBuffer values) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) values, 1);
        }
        nalEffectfvDirect(context, effect, param, MemoryUtil.memAddress(values));
    }

    public static void nalGetEffecti(int effect, int param, long value) {
        long __functionAddress = AL.getICD().alGetEffecti;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(effect, param, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetEffecti(@NativeType("ALuint") int effect, @NativeType("ALenum") int param, @NativeType("ALint *") IntBuffer value) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) value, 1);
        }
        nalGetEffecti(effect, param, MemoryUtil.memAddress(value));
    }

    @NativeType("ALvoid")
    public static int alGetEffecti(@NativeType("ALuint") int effect, @NativeType("ALenum") int param) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            IntBuffer value = stack.callocInt(1);
            nalGetEffecti(effect, param, MemoryUtil.memAddress(value));
            int i = value.get(0);
            stack.setPointer(stackPointer);
            return i;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nalGetEffectiDirect(long context, int effect, int param, long value) {
        long __functionAddress = AL.getICD().alGetEffectiDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPV(context, effect, param, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetEffectiDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effect, @NativeType("ALenum") int param, @NativeType("ALint *") IntBuffer value) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) value, 1);
        }
        nalGetEffectiDirect(context, effect, param, MemoryUtil.memAddress(value));
    }

    @NativeType("ALvoid")
    public static int alGetEffectiDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effect, @NativeType("ALenum") int param) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            IntBuffer value = stack.callocInt(1);
            nalGetEffectiDirect(context, effect, param, MemoryUtil.memAddress(value));
            int i = value.get(0);
            stack.setPointer(stackPointer);
            return i;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nalGetEffectiv(int effect, int param, long values) {
        long __functionAddress = AL.getICD().alGetEffectiv;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(effect, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetEffectiv(@NativeType("ALuint") int effect, @NativeType("ALenum") int param, @NativeType("ALint *") IntBuffer values) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) values, 1);
        }
        nalGetEffectiv(effect, param, MemoryUtil.memAddress(values));
    }

    public static void nalGetEffectivDirect(long context, int effect, int param, long values) {
        long __functionAddress = AL.getICD().alGetEffectivDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPV(context, effect, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetEffectivDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effect, @NativeType("ALenum") int param, @NativeType("ALint *") IntBuffer values) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) values, 1);
        }
        nalGetEffectivDirect(context, effect, param, MemoryUtil.memAddress(values));
    }

    public static void nalGetEffectf(int effect, int param, long value) {
        long __functionAddress = AL.getICD().alGetEffectf;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(effect, param, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetEffectf(@NativeType("ALuint") int effect, @NativeType("ALenum") int param, @NativeType("ALfloat *") FloatBuffer value) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) value, 1);
        }
        nalGetEffectf(effect, param, MemoryUtil.memAddress(value));
    }

    @NativeType("ALvoid")
    public static float alGetEffectf(@NativeType("ALuint") int effect, @NativeType("ALenum") int param) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            FloatBuffer value = stack.callocFloat(1);
            nalGetEffectf(effect, param, MemoryUtil.memAddress(value));
            float f = value.get(0);
            stack.setPointer(stackPointer);
            return f;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nalGetEffectfDirect(long context, int effect, int param, long value) {
        long __functionAddress = AL.getICD().alGetEffectfDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPV(context, effect, param, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetEffectfDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effect, @NativeType("ALenum") int param, @NativeType("ALfloat *") FloatBuffer value) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) value, 1);
        }
        nalGetEffectfDirect(context, effect, param, MemoryUtil.memAddress(value));
    }

    @NativeType("ALvoid")
    public static float alGetEffectfDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effect, @NativeType("ALenum") int param) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            FloatBuffer value = stack.callocFloat(1);
            nalGetEffectfDirect(context, effect, param, MemoryUtil.memAddress(value));
            float f = value.get(0);
            stack.setPointer(stackPointer);
            return f;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nalGetEffectfv(int effect, int param, long values) {
        long __functionAddress = AL.getICD().alGetEffectfv;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(effect, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetEffectfv(@NativeType("ALuint") int effect, @NativeType("ALenum") int param, @NativeType("ALfloat *") FloatBuffer values) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) values, 1);
        }
        nalGetEffectfv(effect, param, MemoryUtil.memAddress(values));
    }

    public static void nalGetEffectfvDirect(long context, int effect, int param, long values) {
        long __functionAddress = AL.getICD().alGetEffectfvDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPV(context, effect, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetEffectfvDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effect, @NativeType("ALenum") int param, @NativeType("ALfloat *") FloatBuffer values) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) values, 1);
        }
        nalGetEffectfvDirect(context, effect, param, MemoryUtil.memAddress(values));
    }

    public static void nalGenFilters(int n, long filters) {
        long __functionAddress = AL.getICD().alGenFilters;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(n, filters, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGenFilters(@NativeType("ALuint *") IntBuffer filters) {
        nalGenFilters(filters.remaining(), MemoryUtil.memAddress(filters));
    }

    @NativeType("ALvoid")
    public static int alGenFilters() {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            IntBuffer filters = stack.callocInt(1);
            nalGenFilters(1, MemoryUtil.memAddress(filters));
            int i = filters.get(0);
            stack.setPointer(stackPointer);
            return i;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nalGenFiltersDirect(long context, int n, long filters) {
        long __functionAddress = AL.getICD().alGenFiltersDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPV(context, n, filters, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGenFiltersDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint *") IntBuffer filters) {
        nalGenFiltersDirect(context, filters.remaining(), MemoryUtil.memAddress(filters));
    }

    @NativeType("ALvoid")
    public static int alGenFiltersDirect(@NativeType("ALCcontext *") long context) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            IntBuffer filters = stack.callocInt(1);
            nalGenFiltersDirect(context, 1, MemoryUtil.memAddress(filters));
            int i = filters.get(0);
            stack.setPointer(stackPointer);
            return i;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nalDeleteFilters(int n, long filters) {
        long __functionAddress = AL.getICD().alDeleteFilters;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(n, filters, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alDeleteFilters(@NativeType("ALuint *") IntBuffer filters) {
        nalDeleteFilters(filters.remaining(), MemoryUtil.memAddress(filters));
    }

    @NativeType("ALvoid")
    public static void alDeleteFilters(@NativeType("ALuint *") int filter) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            IntBuffer filters = stack.ints(filter);
            nalDeleteFilters(1, MemoryUtil.memAddress(filters));
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nalDeleteFiltersDirect(long context, int n, long filters) {
        long __functionAddress = AL.getICD().alDeleteFiltersDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPV(context, n, filters, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alDeleteFiltersDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint *") IntBuffer filters) {
        nalDeleteFiltersDirect(context, filters.remaining(), MemoryUtil.memAddress(filters));
    }

    @NativeType("ALvoid")
    public static void alDeleteFiltersDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint *") int filter) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            IntBuffer filters = stack.ints(filter);
            nalDeleteFiltersDirect(context, 1, MemoryUtil.memAddress(filters));
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("ALboolean")
    public static boolean alIsFilter(@NativeType("ALuint") int filter) {
        long __functionAddress = AL.getICD().alIsFilter;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.invokeZ(filter, __functionAddress);
    }

    @NativeType("ALboolean")
    public static boolean alIsFilterDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int filter) {
        long __functionAddress = AL.getICD().alIsFilterDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        return JNI.invokePZ(context, filter, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alFilteri(@NativeType("ALuint") int filter, @NativeType("ALenum") int param, @NativeType("ALint") int value) {
        long __functionAddress = AL.getICD().alFilteri;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokeV(filter, param, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alFilteriDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int filter, @NativeType("ALenum") int param, @NativeType("ALint") int value) {
        long __functionAddress = AL.getICD().alFilteriDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePV(context, filter, param, value, __functionAddress);
    }

    public static void nalFilteriv(int filter, int param, long values) {
        long __functionAddress = AL.getICD().alFilteriv;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(filter, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alFilteriv(@NativeType("ALuint") int filter, @NativeType("ALenum") int param, @NativeType("ALint const *") IntBuffer values) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) values, 1);
        }
        nalFilteriv(filter, param, MemoryUtil.memAddress(values));
    }

    public static void nalFilterivDirect(long context, int filter, int param, long values) {
        long __functionAddress = AL.getICD().alFilterivDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPV(context, filter, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alFilterivDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int filter, @NativeType("ALenum") int param, @NativeType("ALint const *") IntBuffer values) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) values, 1);
        }
        nalFilterivDirect(context, filter, param, MemoryUtil.memAddress(values));
    }

    @NativeType("ALvoid")
    public static void alFilterf(@NativeType("ALuint") int filter, @NativeType("ALenum") int param, @NativeType("ALfloat") float value) {
        long __functionAddress = AL.getICD().alFilterf;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokeV(filter, param, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alFilterfDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int filter, @NativeType("ALenum") int param, @NativeType("ALfloat") float value) {
        long __functionAddress = AL.getICD().alFilterfDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePV(context, filter, param, value, __functionAddress);
    }

    public static void nalFilterfv(int filter, int param, long values) {
        long __functionAddress = AL.getICD().alFilterfv;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(filter, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alFilterfv(@NativeType("ALuint") int filter, @NativeType("ALenum") int param, @NativeType("ALfloat const *") FloatBuffer values) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) values, 1);
        }
        nalFilterfv(filter, param, MemoryUtil.memAddress(values));
    }

    public static void nalFilterfvDirect(long context, int filter, int param, long values) {
        long __functionAddress = AL.getICD().alFilterfvDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPV(context, filter, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alFilterfvDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int filter, @NativeType("ALenum") int param, @NativeType("ALfloat const *") FloatBuffer values) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) values, 1);
        }
        nalFilterfvDirect(context, filter, param, MemoryUtil.memAddress(values));
    }

    public static void nalGetFilteri(int filter, int param, long value) {
        long __functionAddress = AL.getICD().alGetFilteri;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(filter, param, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetFilteri(@NativeType("ALuint") int filter, @NativeType("ALenum") int param, @NativeType("ALint *") IntBuffer value) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) value, 1);
        }
        nalGetFilteri(filter, param, MemoryUtil.memAddress(value));
    }

    @NativeType("ALvoid")
    public static int alGetFilteri(@NativeType("ALuint") int filter, @NativeType("ALenum") int param) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            IntBuffer value = stack.callocInt(1);
            nalGetFilteri(filter, param, MemoryUtil.memAddress(value));
            int i = value.get(0);
            stack.setPointer(stackPointer);
            return i;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nalGetFilteriDirect(long context, int filter, int param, long value) {
        long __functionAddress = AL.getICD().alGetFilteriDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPV(context, filter, param, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetFilteriDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int filter, @NativeType("ALenum") int param, @NativeType("ALint *") IntBuffer value) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) value, 1);
        }
        nalGetFilteriDirect(context, filter, param, MemoryUtil.memAddress(value));
    }

    @NativeType("ALvoid")
    public static int alGetFilteriDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int filter, @NativeType("ALenum") int param) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            IntBuffer value = stack.callocInt(1);
            nalGetFilteriDirect(context, filter, param, MemoryUtil.memAddress(value));
            int i = value.get(0);
            stack.setPointer(stackPointer);
            return i;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nalGetFilteriv(int filter, int param, long values) {
        long __functionAddress = AL.getICD().alGetFilteriv;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(filter, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetFilteriv(@NativeType("ALuint") int filter, @NativeType("ALenum") int param, @NativeType("ALint *") IntBuffer values) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) values, 1);
        }
        nalGetFilteriv(filter, param, MemoryUtil.memAddress(values));
    }

    public static void nalGetFilterivDirect(long context, int filter, int param, long values) {
        long __functionAddress = AL.getICD().alGetFilterivDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPV(context, filter, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetFilterivDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int filter, @NativeType("ALenum") int param, @NativeType("ALint *") IntBuffer values) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) values, 1);
        }
        nalGetFilterivDirect(context, filter, param, MemoryUtil.memAddress(values));
    }

    public static void nalGetFilterf(int filter, int param, long value) {
        long __functionAddress = AL.getICD().alGetFilterf;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(filter, param, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetFilterf(@NativeType("ALuint") int filter, @NativeType("ALenum") int param, @NativeType("ALfloat *") FloatBuffer value) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) value, 1);
        }
        nalGetFilterf(filter, param, MemoryUtil.memAddress(value));
    }

    @NativeType("ALvoid")
    public static float alGetFilterf(@NativeType("ALuint") int filter, @NativeType("ALenum") int param) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            FloatBuffer value = stack.callocFloat(1);
            nalGetFilterf(filter, param, MemoryUtil.memAddress(value));
            float f = value.get(0);
            stack.setPointer(stackPointer);
            return f;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nalGetFilterfDirect(long context, int filter, int param, long value) {
        long __functionAddress = AL.getICD().alGetFilterfDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPV(context, filter, param, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetFilterfDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int filter, @NativeType("ALenum") int param, @NativeType("ALfloat *") FloatBuffer value) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) value, 1);
        }
        nalGetFilterfDirect(context, filter, param, MemoryUtil.memAddress(value));
    }

    @NativeType("ALvoid")
    public static float alGetFilterfDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int filter, @NativeType("ALenum") int param) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            FloatBuffer value = stack.callocFloat(1);
            nalGetFilterfDirect(context, filter, param, MemoryUtil.memAddress(value));
            float f = value.get(0);
            stack.setPointer(stackPointer);
            return f;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nalGetFilterfv(int filter, int param, long values) {
        long __functionAddress = AL.getICD().alGetFilterfv;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(filter, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetFilterfv(@NativeType("ALuint") int filter, @NativeType("ALenum") int param, @NativeType("ALfloat *") FloatBuffer values) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) values, 1);
        }
        nalGetFilterfv(filter, param, MemoryUtil.memAddress(values));
    }

    public static void nalGetFilterfvDirect(long context, int filter, int param, long values) {
        long __functionAddress = AL.getICD().alGetFilterfvDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPV(context, filter, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetFilterfvDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int filter, @NativeType("ALenum") int param, @NativeType("ALfloat *") FloatBuffer values) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) values, 1);
        }
        nalGetFilterfvDirect(context, filter, param, MemoryUtil.memAddress(values));
    }

    public static void nalGenAuxiliaryEffectSlots(int n, long effectSlots) {
        long __functionAddress = AL.getICD().alGenAuxiliaryEffectSlots;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(n, effectSlots, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGenAuxiliaryEffectSlots(@NativeType("ALuint *") IntBuffer effectSlots) {
        nalGenAuxiliaryEffectSlots(effectSlots.remaining(), MemoryUtil.memAddress(effectSlots));
    }

    @NativeType("ALvoid")
    public static int alGenAuxiliaryEffectSlots() {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            IntBuffer effectSlots = stack.callocInt(1);
            nalGenAuxiliaryEffectSlots(1, MemoryUtil.memAddress(effectSlots));
            int i = effectSlots.get(0);
            stack.setPointer(stackPointer);
            return i;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nalGenAuxiliaryEffectSlotsDirect(long context, int n, long effectSlots) {
        long __functionAddress = AL.getICD().alGenAuxiliaryEffectSlotsDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPV(context, n, effectSlots, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGenAuxiliaryEffectSlotsDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint *") IntBuffer effectSlots) {
        nalGenAuxiliaryEffectSlotsDirect(context, effectSlots.remaining(), MemoryUtil.memAddress(effectSlots));
    }

    @NativeType("ALvoid")
    public static int alGenAuxiliaryEffectSlotsDirect(@NativeType("ALCcontext *") long context) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            IntBuffer effectSlots = stack.callocInt(1);
            nalGenAuxiliaryEffectSlotsDirect(context, 1, MemoryUtil.memAddress(effectSlots));
            int i = effectSlots.get(0);
            stack.setPointer(stackPointer);
            return i;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nalDeleteAuxiliaryEffectSlots(int n, long effectSlots) {
        long __functionAddress = AL.getICD().alDeleteAuxiliaryEffectSlots;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(n, effectSlots, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alDeleteAuxiliaryEffectSlots(@NativeType("ALuint *") IntBuffer effectSlots) {
        nalDeleteAuxiliaryEffectSlots(effectSlots.remaining(), MemoryUtil.memAddress(effectSlots));
    }

    @NativeType("ALvoid")
    public static void alDeleteAuxiliaryEffectSlots(@NativeType("ALuint *") int effectSlot) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            IntBuffer effectSlots = stack.ints(effectSlot);
            nalDeleteAuxiliaryEffectSlots(1, MemoryUtil.memAddress(effectSlots));
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nalDeleteAuxiliaryEffectSlotsDirect(long context, int n, long effectSlots) {
        long __functionAddress = AL.getICD().alDeleteAuxiliaryEffectSlotsDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPV(context, n, effectSlots, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alDeleteAuxiliaryEffectSlotsDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint *") IntBuffer effectSlots) {
        nalDeleteAuxiliaryEffectSlotsDirect(context, effectSlots.remaining(), MemoryUtil.memAddress(effectSlots));
    }

    @NativeType("ALvoid")
    public static void alDeleteAuxiliaryEffectSlotsDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint *") int effectSlot) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            IntBuffer effectSlots = stack.ints(effectSlot);
            nalDeleteAuxiliaryEffectSlotsDirect(context, 1, MemoryUtil.memAddress(effectSlots));
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("ALboolean")
    public static boolean alIsAuxiliaryEffectSlot(@NativeType("ALuint") int effectSlot) {
        long __functionAddress = AL.getICD().alIsAuxiliaryEffectSlot;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        return JNI.invokeZ(effectSlot, __functionAddress);
    }

    @NativeType("ALboolean")
    public static boolean alIsAuxiliaryEffectSlotDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effectSlot) {
        long __functionAddress = AL.getICD().alIsAuxiliaryEffectSlotDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        return JNI.invokePZ(context, effectSlot, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alAuxiliaryEffectSloti(@NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param, @NativeType("ALint") int value) {
        long __functionAddress = AL.getICD().alAuxiliaryEffectSloti;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokeV(effectSlot, param, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alAuxiliaryEffectSlotiDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param, @NativeType("ALint") int value) {
        long __functionAddress = AL.getICD().alAuxiliaryEffectSlotiDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePV(context, effectSlot, param, value, __functionAddress);
    }

    public static void nalAuxiliaryEffectSlotiv(int effectSlot, int param, long values) {
        long __functionAddress = AL.getICD().alAuxiliaryEffectSlotiv;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(effectSlot, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alAuxiliaryEffectSlotiv(@NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param, @NativeType("ALint const *") IntBuffer values) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) values, 1);
        }
        nalAuxiliaryEffectSlotiv(effectSlot, param, MemoryUtil.memAddress(values));
    }

    public static void nalAuxiliaryEffectSlotivDirect(long context, int effectSlot, int param, long values) {
        long __functionAddress = AL.getICD().alAuxiliaryEffectSlotivDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPV(context, effectSlot, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alAuxiliaryEffectSlotivDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param, @NativeType("ALint const *") IntBuffer values) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) values, 1);
        }
        nalAuxiliaryEffectSlotivDirect(context, effectSlot, param, MemoryUtil.memAddress(values));
    }

    @NativeType("ALvoid")
    public static void alAuxiliaryEffectSlotf(@NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param, @NativeType("ALfloat") float value) {
        long __functionAddress = AL.getICD().alAuxiliaryEffectSlotf;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokeV(effectSlot, param, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alAuxiliaryEffectSlotfDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param, @NativeType("ALfloat") float value) {
        long __functionAddress = AL.getICD().alAuxiliaryEffectSlotfDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePV(context, effectSlot, param, value, __functionAddress);
    }

    public static void nalAuxiliaryEffectSlotfv(int effectSlot, int param, long values) {
        long __functionAddress = AL.getICD().alAuxiliaryEffectSlotfv;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(effectSlot, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alAuxiliaryEffectSlotfv(@NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param, @NativeType("ALfloat const *") FloatBuffer values) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) values, 1);
        }
        nalAuxiliaryEffectSlotfv(effectSlot, param, MemoryUtil.memAddress(values));
    }

    public static void nalAuxiliaryEffectSlotfvDirect(long context, int effectSlot, int param, long values) {
        long __functionAddress = AL.getICD().alAuxiliaryEffectSlotfvDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPV(context, effectSlot, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alAuxiliaryEffectSlotfvDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param, @NativeType("ALfloat const *") FloatBuffer values) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) values, 1);
        }
        nalAuxiliaryEffectSlotfvDirect(context, effectSlot, param, MemoryUtil.memAddress(values));
    }

    public static void nalGetAuxiliaryEffectSloti(int effectSlot, int param, long value) {
        long __functionAddress = AL.getICD().alGetAuxiliaryEffectSloti;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(effectSlot, param, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetAuxiliaryEffectSloti(@NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param, @NativeType("ALint *") IntBuffer value) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) value, 1);
        }
        nalGetAuxiliaryEffectSloti(effectSlot, param, MemoryUtil.memAddress(value));
    }

    @NativeType("ALvoid")
    public static int alGetAuxiliaryEffectSloti(@NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            IntBuffer value = stack.callocInt(1);
            nalGetAuxiliaryEffectSloti(effectSlot, param, MemoryUtil.memAddress(value));
            int i = value.get(0);
            stack.setPointer(stackPointer);
            return i;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nalGetAuxiliaryEffectSlotiDirect(long context, int effectSlot, int param, long value) {
        long __functionAddress = AL.getICD().alGetAuxiliaryEffectSlotiDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPV(context, effectSlot, param, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetAuxiliaryEffectSlotiDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param, @NativeType("ALint *") IntBuffer value) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) value, 1);
        }
        nalGetAuxiliaryEffectSlotiDirect(context, effectSlot, param, MemoryUtil.memAddress(value));
    }

    @NativeType("ALvoid")
    public static int alGetAuxiliaryEffectSlotiDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            IntBuffer value = stack.callocInt(1);
            nalGetAuxiliaryEffectSlotiDirect(context, effectSlot, param, MemoryUtil.memAddress(value));
            int i = value.get(0);
            stack.setPointer(stackPointer);
            return i;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nalGetAuxiliaryEffectSlotiv(int effectSlot, int param, long values) {
        long __functionAddress = AL.getICD().alGetAuxiliaryEffectSlotiv;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(effectSlot, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetAuxiliaryEffectSlotiv(@NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param, @NativeType("ALint *") IntBuffer values) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) values, 1);
        }
        nalGetAuxiliaryEffectSlotiv(effectSlot, param, MemoryUtil.memAddress(values));
    }

    public static void nalGetAuxiliaryEffectSlotivDirect(long context, int effectSlot, int param, long values) {
        long __functionAddress = AL.getICD().alGetAuxiliaryEffectSlotivDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPV(context, effectSlot, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetAuxiliaryEffectSlotivDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param, @NativeType("ALint *") IntBuffer values) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) values, 1);
        }
        nalGetAuxiliaryEffectSlotivDirect(context, effectSlot, param, MemoryUtil.memAddress(values));
    }

    public static void nalGetAuxiliaryEffectSlotf(int effectSlot, int param, long value) {
        long __functionAddress = AL.getICD().alGetAuxiliaryEffectSlotf;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(effectSlot, param, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetAuxiliaryEffectSlotf(@NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param, @NativeType("ALfloat *") FloatBuffer value) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) value, 1);
        }
        nalGetAuxiliaryEffectSlotf(effectSlot, param, MemoryUtil.memAddress(value));
    }

    @NativeType("ALvoid")
    public static float alGetAuxiliaryEffectSlotf(@NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            FloatBuffer value = stack.callocFloat(1);
            nalGetAuxiliaryEffectSlotf(effectSlot, param, MemoryUtil.memAddress(value));
            float f = value.get(0);
            stack.setPointer(stackPointer);
            return f;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nalGetAuxiliaryEffectSlotfDirect(long context, int effectSlot, int param, long value) {
        long __functionAddress = AL.getICD().alGetAuxiliaryEffectSlotfDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPV(context, effectSlot, param, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetAuxiliaryEffectSlotfDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param, @NativeType("ALfloat *") FloatBuffer value) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) value, 1);
        }
        nalGetAuxiliaryEffectSlotfDirect(context, effectSlot, param, MemoryUtil.memAddress(value));
    }

    @NativeType("ALvoid")
    public static float alGetAuxiliaryEffectSlotfDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            FloatBuffer value = stack.callocFloat(1);
            nalGetAuxiliaryEffectSlotfDirect(context, effectSlot, param, MemoryUtil.memAddress(value));
            float f = value.get(0);
            stack.setPointer(stackPointer);
            return f;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nalGetAuxiliaryEffectSlotfv(int effectSlot, int param, long values) {
        long __functionAddress = AL.getICD().alGetAuxiliaryEffectSlotfv;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(effectSlot, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetAuxiliaryEffectSlotfv(@NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param, @NativeType("ALfloat *") FloatBuffer values) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) values, 1);
        }
        nalGetAuxiliaryEffectSlotfv(effectSlot, param, MemoryUtil.memAddress(values));
    }

    public static void nalGetAuxiliaryEffectSlotfvDirect(long context, int effectSlot, int param, long values) {
        long __functionAddress = AL.getICD().alGetAuxiliaryEffectSlotfvDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPV(context, effectSlot, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetAuxiliaryEffectSlotfvDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param, @NativeType("ALfloat *") FloatBuffer values) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) values, 1);
        }
        nalGetAuxiliaryEffectSlotfvDirect(context, effectSlot, param, MemoryUtil.memAddress(values));
    }

    @NativeType("ALvoid")
    public static void alGenEffects(@NativeType("ALuint *") int[] effects) {
        long __functionAddress = AL.getICD().alGenEffects;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(effects.length, effects, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGenEffectsDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint *") int[] effects) {
        long __functionAddress = AL.getICD().alGenEffectsDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPV(context, effects.length, effects, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alDeleteEffects(@NativeType("ALuint *") int[] effects) {
        long __functionAddress = AL.getICD().alDeleteEffects;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(effects.length, effects, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alDeleteEffectsDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint *") int[] effects) {
        long __functionAddress = AL.getICD().alDeleteEffectsDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPV(context, effects.length, effects, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alEffectiv(@NativeType("ALuint") int effect, @NativeType("ALenum") int param, @NativeType("ALint const *") int[] values) {
        long __functionAddress = AL.getICD().alEffectiv;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(values, 1);
        }
        JNI.invokePV(effect, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alEffectivDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effect, @NativeType("ALenum") int param, @NativeType("ALint const *") int[] values) {
        long __functionAddress = AL.getICD().alEffectivDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
            Checks.check(values, 1);
        }
        JNI.invokePPV(context, effect, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alEffectfv(@NativeType("ALuint") int effect, @NativeType("ALenum") int param, @NativeType("ALfloat const *") float[] values) {
        long __functionAddress = AL.getICD().alEffectfv;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(values, 1);
        }
        JNI.invokePV(effect, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alEffectfvDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effect, @NativeType("ALenum") int param, @NativeType("ALfloat const *") float[] values) {
        long __functionAddress = AL.getICD().alEffectfvDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
            Checks.check(values, 1);
        }
        JNI.invokePPV(context, effect, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetEffecti(@NativeType("ALuint") int effect, @NativeType("ALenum") int param, @NativeType("ALint *") int[] value) {
        long __functionAddress = AL.getICD().alGetEffecti;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(value, 1);
        }
        JNI.invokePV(effect, param, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetEffectiDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effect, @NativeType("ALenum") int param, @NativeType("ALint *") int[] value) {
        long __functionAddress = AL.getICD().alGetEffectiDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
            Checks.check(value, 1);
        }
        JNI.invokePPV(context, effect, param, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetEffectiv(@NativeType("ALuint") int effect, @NativeType("ALenum") int param, @NativeType("ALint *") int[] values) {
        long __functionAddress = AL.getICD().alGetEffectiv;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(values, 1);
        }
        JNI.invokePV(effect, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetEffectivDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effect, @NativeType("ALenum") int param, @NativeType("ALint *") int[] values) {
        long __functionAddress = AL.getICD().alGetEffectivDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
            Checks.check(values, 1);
        }
        JNI.invokePPV(context, effect, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetEffectf(@NativeType("ALuint") int effect, @NativeType("ALenum") int param, @NativeType("ALfloat *") float[] value) {
        long __functionAddress = AL.getICD().alGetEffectf;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(value, 1);
        }
        JNI.invokePV(effect, param, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetEffectfDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effect, @NativeType("ALenum") int param, @NativeType("ALfloat *") float[] value) {
        long __functionAddress = AL.getICD().alGetEffectfDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
            Checks.check(value, 1);
        }
        JNI.invokePPV(context, effect, param, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetEffectfv(@NativeType("ALuint") int effect, @NativeType("ALenum") int param, @NativeType("ALfloat *") float[] values) {
        long __functionAddress = AL.getICD().alGetEffectfv;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(values, 1);
        }
        JNI.invokePV(effect, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetEffectfvDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effect, @NativeType("ALenum") int param, @NativeType("ALfloat *") float[] values) {
        long __functionAddress = AL.getICD().alGetEffectfvDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
            Checks.check(values, 1);
        }
        JNI.invokePPV(context, effect, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGenFilters(@NativeType("ALuint *") int[] filters) {
        long __functionAddress = AL.getICD().alGenFilters;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(filters.length, filters, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGenFiltersDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint *") int[] filters) {
        long __functionAddress = AL.getICD().alGenFiltersDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPV(context, filters.length, filters, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alDeleteFilters(@NativeType("ALuint *") int[] filters) {
        long __functionAddress = AL.getICD().alDeleteFilters;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(filters.length, filters, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alDeleteFiltersDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint *") int[] filters) {
        long __functionAddress = AL.getICD().alDeleteFiltersDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPV(context, filters.length, filters, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alFilteriv(@NativeType("ALuint") int filter, @NativeType("ALenum") int param, @NativeType("ALint const *") int[] values) {
        long __functionAddress = AL.getICD().alFilteriv;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(values, 1);
        }
        JNI.invokePV(filter, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alFilterivDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int filter, @NativeType("ALenum") int param, @NativeType("ALint const *") int[] values) {
        long __functionAddress = AL.getICD().alFilterivDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
            Checks.check(values, 1);
        }
        JNI.invokePPV(context, filter, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alFilterfv(@NativeType("ALuint") int filter, @NativeType("ALenum") int param, @NativeType("ALfloat const *") float[] values) {
        long __functionAddress = AL.getICD().alFilterfv;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(values, 1);
        }
        JNI.invokePV(filter, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alFilterfvDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int filter, @NativeType("ALenum") int param, @NativeType("ALfloat const *") float[] values) {
        long __functionAddress = AL.getICD().alFilterfvDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
            Checks.check(values, 1);
        }
        JNI.invokePPV(context, filter, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetFilteri(@NativeType("ALuint") int filter, @NativeType("ALenum") int param, @NativeType("ALint *") int[] value) {
        long __functionAddress = AL.getICD().alGetFilteri;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(value, 1);
        }
        JNI.invokePV(filter, param, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetFilteriDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int filter, @NativeType("ALenum") int param, @NativeType("ALint *") int[] value) {
        long __functionAddress = AL.getICD().alGetFilteriDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
            Checks.check(value, 1);
        }
        JNI.invokePPV(context, filter, param, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetFilteriv(@NativeType("ALuint") int filter, @NativeType("ALenum") int param, @NativeType("ALint *") int[] values) {
        long __functionAddress = AL.getICD().alGetFilteriv;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(values, 1);
        }
        JNI.invokePV(filter, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetFilterivDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int filter, @NativeType("ALenum") int param, @NativeType("ALint *") int[] values) {
        long __functionAddress = AL.getICD().alGetFilterivDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
            Checks.check(values, 1);
        }
        JNI.invokePPV(context, filter, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetFilterf(@NativeType("ALuint") int filter, @NativeType("ALenum") int param, @NativeType("ALfloat *") float[] value) {
        long __functionAddress = AL.getICD().alGetFilterf;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(value, 1);
        }
        JNI.invokePV(filter, param, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetFilterfDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int filter, @NativeType("ALenum") int param, @NativeType("ALfloat *") float[] value) {
        long __functionAddress = AL.getICD().alGetFilterfDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
            Checks.check(value, 1);
        }
        JNI.invokePPV(context, filter, param, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetFilterfv(@NativeType("ALuint") int filter, @NativeType("ALenum") int param, @NativeType("ALfloat *") float[] values) {
        long __functionAddress = AL.getICD().alGetFilterfv;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(values, 1);
        }
        JNI.invokePV(filter, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetFilterfvDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int filter, @NativeType("ALenum") int param, @NativeType("ALfloat *") float[] values) {
        long __functionAddress = AL.getICD().alGetFilterfvDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
            Checks.check(values, 1);
        }
        JNI.invokePPV(context, filter, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGenAuxiliaryEffectSlots(@NativeType("ALuint *") int[] effectSlots) {
        long __functionAddress = AL.getICD().alGenAuxiliaryEffectSlots;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(effectSlots.length, effectSlots, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGenAuxiliaryEffectSlotsDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint *") int[] effectSlots) {
        long __functionAddress = AL.getICD().alGenAuxiliaryEffectSlotsDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPV(context, effectSlots.length, effectSlots, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alDeleteAuxiliaryEffectSlots(@NativeType("ALuint *") int[] effectSlots) {
        long __functionAddress = AL.getICD().alDeleteAuxiliaryEffectSlots;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.invokePV(effectSlots.length, effectSlots, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alDeleteAuxiliaryEffectSlotsDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint *") int[] effectSlots) {
        long __functionAddress = AL.getICD().alDeleteAuxiliaryEffectSlotsDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
        }
        JNI.invokePPV(context, effectSlots.length, effectSlots, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alAuxiliaryEffectSlotiv(@NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param, @NativeType("ALint const *") int[] values) {
        long __functionAddress = AL.getICD().alAuxiliaryEffectSlotiv;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(values, 1);
        }
        JNI.invokePV(effectSlot, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alAuxiliaryEffectSlotivDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param, @NativeType("ALint const *") int[] values) {
        long __functionAddress = AL.getICD().alAuxiliaryEffectSlotivDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
            Checks.check(values, 1);
        }
        JNI.invokePPV(context, effectSlot, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alAuxiliaryEffectSlotfv(@NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param, @NativeType("ALfloat const *") float[] values) {
        long __functionAddress = AL.getICD().alAuxiliaryEffectSlotfv;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(values, 1);
        }
        JNI.invokePV(effectSlot, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alAuxiliaryEffectSlotfvDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param, @NativeType("ALfloat const *") float[] values) {
        long __functionAddress = AL.getICD().alAuxiliaryEffectSlotfvDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
            Checks.check(values, 1);
        }
        JNI.invokePPV(context, effectSlot, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetAuxiliaryEffectSloti(@NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param, @NativeType("ALint *") int[] value) {
        long __functionAddress = AL.getICD().alGetAuxiliaryEffectSloti;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(value, 1);
        }
        JNI.invokePV(effectSlot, param, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetAuxiliaryEffectSlotiDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param, @NativeType("ALint *") int[] value) {
        long __functionAddress = AL.getICD().alGetAuxiliaryEffectSlotiDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
            Checks.check(value, 1);
        }
        JNI.invokePPV(context, effectSlot, param, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetAuxiliaryEffectSlotiv(@NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param, @NativeType("ALint *") int[] values) {
        long __functionAddress = AL.getICD().alGetAuxiliaryEffectSlotiv;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(values, 1);
        }
        JNI.invokePV(effectSlot, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetAuxiliaryEffectSlotivDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param, @NativeType("ALint *") int[] values) {
        long __functionAddress = AL.getICD().alGetAuxiliaryEffectSlotivDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
            Checks.check(values, 1);
        }
        JNI.invokePPV(context, effectSlot, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetAuxiliaryEffectSlotf(@NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param, @NativeType("ALfloat *") float[] value) {
        long __functionAddress = AL.getICD().alGetAuxiliaryEffectSlotf;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(value, 1);
        }
        JNI.invokePV(effectSlot, param, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetAuxiliaryEffectSlotfDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param, @NativeType("ALfloat *") float[] value) {
        long __functionAddress = AL.getICD().alGetAuxiliaryEffectSlotfDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
            Checks.check(value, 1);
        }
        JNI.invokePPV(context, effectSlot, param, value, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetAuxiliaryEffectSlotfv(@NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param, @NativeType("ALfloat *") float[] values) {
        long __functionAddress = AL.getICD().alGetAuxiliaryEffectSlotfv;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(values, 1);
        }
        JNI.invokePV(effectSlot, param, values, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alGetAuxiliaryEffectSlotfvDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int effectSlot, @NativeType("ALenum") int param, @NativeType("ALfloat *") float[] values) {
        long __functionAddress = AL.getICD().alGetAuxiliaryEffectSlotfvDirect;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(context);
            Checks.check(values, 1);
        }
        JNI.invokePPV(context, effectSlot, param, values, __functionAddress);
    }
}

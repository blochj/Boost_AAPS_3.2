package info.nightscout.source

import app.aaps.shared.tests.TestBase
import dagger.android.AndroidInjector
import info.nightscout.shared.interfaces.ResourceHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mock

class GlimpPluginTest : TestBase() {

    private lateinit var glimpPlugin: GlimpPlugin

    @Mock lateinit var rh: ResourceHelper

    @BeforeEach
    fun setup() {
        glimpPlugin = GlimpPlugin({ AndroidInjector { } }, rh, aapsLogger)
    }

    @Test fun advancedFilteringSupported() {
        Assertions.assertEquals(false, glimpPlugin.advancedFilteringSupported())
    }
}
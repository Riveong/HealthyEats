package com.example.healthyeats.di

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStore
import com.example.healthyeats.data.local.TokenPreference
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

private val Context.dataStore: DataStore<androidx.datastore.preferences.core.Preferences> by preferencesDataStore(name = "application")
@Module
@InstallIn(SingletonComponent::class)
class DatastoreModule {
    @Provides
    fun provideDatastore(@ApplicationContext context: Context): DataStore<Preferences> = context.dataStore

    @Provides
    @Singleton
    fun provideTokenPreferences(dataStore: DataStore<Preferences>): TokenPreference = TokenPreference(dataStore)
}
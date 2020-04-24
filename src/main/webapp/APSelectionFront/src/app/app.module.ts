import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule,ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TimeToWordsComponent } from './time-to-words/time-to-words.component';
import { CreateEventComponent } from './create-event/create-event.component';
import { GetAllEventsComponent } from './get-all-events/get-all-events.component';
import { MenuPageComponent } from './menu-page/menu-page.component';

@NgModule({
  declarations: [
    AppComponent,
    TimeToWordsComponent,
    CreateEventComponent,
    GetAllEventsComponent,
    MenuPageComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HTTP_INTERCEPTORS, HttpClientModule, HttpClientXsrfModule } from '@angular/common/http';
import {ReactiveFormsModule} from '@angular/forms';
import { AppComponent } from './app.component';
import { RouteExampleComponent } from './route-example/route-example.component';

import { AppService } from './app.service';
import { AppHttpInterceptorService } from './http-interceptor.service';
import { AddItemComponent } from './add-item/add-item.component';
import { BorrowItemComponent } from './borrow-item/borrow-item.component';
import { DeleteItemComponent } from './delete-item/delete-item.component';
import { DisplayItemsComponent } from './display-items/display-items.component';
import { GenerateReportComponent } from './generate-report/generate-report.component';
import { HomePageComponent } from './home-page/home-page.component';
import { LoginPageComponent } from './login-page/login-page.component';
import { ReturnItemsComponent } from './return-items/return-items.component';

const routes: Routes = [

  {path: '',component:LoginPageComponent},
  {path: 'home-page',component:HomePageComponent},
  {path: 'add-item',component:AddItemComponent},
  {path: 'borrow-item',component:BorrowItemComponent},
  {path: 'delete-item',component:DeleteItemComponent},
  {path: 'display-items',component:DisplayItemsComponent},
  {path: 'generate-report',component:GenerateReportComponent},
  {path: 'login-page',component:LoginPageComponent},
  {path: 'return-items',component:ReturnItemsComponent}
];

@NgModule({
  declarations: [
    AppComponent,
    RouteExampleComponent,
    AddItemComponent,
    BorrowItemComponent,
    DeleteItemComponent,
    DisplayItemsComponent,
    GenerateReportComponent,
    HomePageComponent,
    LoginPageComponent,
    ReturnItemsComponent
  ],
  imports: [
    BrowserModule,
    ReactiveFormsModule,
    HttpClientModule,
    HttpClientXsrfModule.withOptions({
      cookieName: 'Csrf-Token',
      headerName: 'Csrf-Token',
    }),
    RouterModule.forRoot(routes)
  ],
  providers: [
    AppService,
    {
      multi: true,
      provide: HTTP_INTERCEPTORS,
      useClass: AppHttpInterceptorService
    }
  ],
  bootstrap: [AppComponent]
})
export class AppModule {
}

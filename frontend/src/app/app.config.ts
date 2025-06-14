import { ApplicationConfig } from '@angular/core';
import { provideRouter } from '@angular/router';

import { routes } from './app.routes';
import { provideHttpClient, withFetch } from '@angular/common/http';
import { provideClientHydration } from '@angular/platform-browser';

export const appConfig: ApplicationConfig = {
  // TODO: mit csinálnak ezek?
  providers: [provideRouter(routes), provideClientHydration(), provideHttpClient(withFetch())]
};
